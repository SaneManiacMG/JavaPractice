package com.sane.maniac.mg;

import com.sane.maniac.mg.datatypes.DataTypes;
import com.sane.maniac.mg.operands.Operands;
import com.sane.maniac.mg.typeconversions.CastingAndTypeConversion;

public class MainClass {
    public static void main(String[] args) {
        
        callOperatorsMethods();
    }

    public static void callDataTypeMethods() {
        DataTypes.primitiveDataTypes();
        DataTypes.stringDataType();
        DataTypes.stringBufferAndStringBuilder();
    }
    
    public static void callCastingMethods() {
        CastingAndTypeConversion.wideningConversion();
        CastingAndTypeConversion.narrowingConversion();
        CastingAndTypeConversion.numericPromotion();
        CastingAndTypeConversion.stringConversion();
        CastingAndTypeConversion.stringToNumberConversion();
        CastingAndTypeConversion.explicitTypeCasting();
        CastingAndTypeConversion.dataTypeParsing();
    }

    public static void callOperatorsMethods() {
        Operands.arithmeticOperators();
        Operands.relationalOperators();
        Operands.logicalOperators();
        Operands.assignmentOperators();
        Operands.incrementAndDecrementOperators();
        Operands.ternaryOperators();
        Operands.bitwiseAndBitShiftOperators();
    }
}
