package com.epam.nataliya_shchukina.lesson1.task3;

public class calcProcessing {
    static float GetResult(String operation,float value1,float value2) throws Exception {
        switch (operation)
        {
            case "+":
                return calcProcessing.AdditionalResult(value1,value2);

            case "-":
                return calcProcessing.SubtractionResult(value1,value2);

            case "*":
                return calcProcessing.MultiplayResult(value1,value2);

            case "/":
                return calcProcessing.DivisionResult(value1,value2);

            default:
                throw new Exception("This statement is not supported.");
        }
    }
    static float AdditionalResult (float value1, float value2)
    {
        return value1 + value2;
    }
    static float SubtractionResult (float value1, float value2)
    {
        return value1 - value2;
    }
    static float MultiplayResult (float value1, float value2)
    {
        return value1 * value2;
    }
    static float DivisionResult (float value1, float value2)
    {
        return value1 / value2;
    }
}


