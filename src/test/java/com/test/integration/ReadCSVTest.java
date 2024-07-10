package com.test.integration;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReadCSVTest {

    @Test
    void testALl() {
        ReadCSV readCSV = new ReadCSV();
        readCSV.processInputFile();
    }

}