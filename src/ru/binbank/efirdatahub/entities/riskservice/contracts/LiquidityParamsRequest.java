package ru.binbank.efirdatahub.entities.riskservice.contracts;

import ru.binbank.efirdatahub.entities.IRequest;

import java.util.HashMap;

//without test
public class LiquidityParamsRequest implements IRequest {
    private String id;          //required
    private String date;        //required
    private String operation;   //required

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    @Override
    public HashMap<String, String> getParams() {
        HashMap<String, String> result = new HashMap<String, String>();

        if(id!=null && !id.isEmpty())
            result.put("id", id);

        if(date!=null && !date.isEmpty())
            result.put("date", date);

        if(operation!=null && !operation.isEmpty())
            result.put("operation", operation);

        return result;
    }
}
