package com.endava.intership.Framework.Infrastructure.Helper.Utility;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class JsonReader {
    public static <T> T fromJSON(final TypeReference<T> type, final String filePath) throws IOException {
        byte[] readElements = Files.readAllBytes(Paths.get(filePath));
        return new ObjectMapper().readValue(readElements, type);
    }
}

