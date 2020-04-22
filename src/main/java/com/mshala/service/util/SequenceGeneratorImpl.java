package com.mshala.service.util;

import com.mshala.model.SequenceId;
import com.mshala.service.exception.SequenceException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

@Repository
public class SequenceGeneratorImpl implements SequenceGenerator {

    @Autowired
    MongoOperations mongoOperations;

    @Override
    public String getNextSequenceId(String key) {

        if(StringUtils.isBlank(key) || key.length()<2)
            throw new SequenceException("Invalid key : " + key);

        Query query = new Query(Criteria.where("_id").is(key));
        Update update = new Update();
        update.inc("seq",1);

        SequenceId sequenceId = mongoOperations.findAndModify(query, update, new FindAndModifyOptions().returnNew(true), SequenceId.class);

        if(sequenceId == null)
            throw new SequenceException("Unable to get SequenceId for Key : " + key);

        return sequenceId.getId().substring(0,2) + String.format("%04d", sequenceId.getSeq());
    }
}
