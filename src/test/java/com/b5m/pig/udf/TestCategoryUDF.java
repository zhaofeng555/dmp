package com.b5m.pig.udf;

import static org.testng.Assert.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import org.apache.pig.data.Tuple;
import org.apache.pig.data.TupleFactory;

import java.io.IOException;
import java.util.Arrays;

public class TestCategoryUDF {

    private TupleFactory tupleFactory = TupleFactory.getInstance();
    private CategoryUDF func = new CategoryUDF();

    @DataProvider(name="tuples")
    public Object[][] titles() {
        return new Object[][] {
            { tupleFactory.newTuple("title"), null }, // TODO to be implemented
        };
    }

    @Test(dataProvider="tuples")
    public void testCategoryUDF(Tuple tuple, String category) throws IOException {
        String output = func.exec(tuple);
        assertEquals(category, output);
    }

}

