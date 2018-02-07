package ru.binbank.efirdatahub.entities.infoservice.contracts;

import ru.binbank.efirdatahub.entities.IRequest;

import java.util.HashMap;

public class EnumValuesRequest implements IRequest{
    private String dictionaryName;  //required
    private String fieldName;       //required

    public String getDictionaryName() {
        return dictionaryName;
    }
    public void setDictionaryName(String dictionaryName) {
        this.dictionaryName = dictionaryName;
    }
    public String getFieldName() {
        return fieldName;
    }
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    @Override
    public HashMap<String, String> getParams() {
        HashMap<String, String> result = new HashMap<String, String>();
        if(dictionaryName!=null && !dictionaryName.isEmpty())
            result.put("dictionaryName", dictionaryName);
        if(fieldName!=null && !fieldName.isEmpty())
            result.put("fieldName", fieldName);
        return result;
    }
}
