package com.shd.springdata.serializer;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class JsonDateTimeSerializer extends JsonSerializer<Date> {

    @Override
    public void serialize(Date value, JsonGenerator gen, SerializerProvider serializers)
	    throws IOException, JsonProcessingException {
	// TODO Auto-generated method stub

	SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	if (value != null) {
	    gen.writeString(format.format(value));
	}

    }

}
