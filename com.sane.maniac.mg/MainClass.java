package com.sane.maniac.mg;

import com.sane.maniac.mg.datatypes.DataTypes;
import com.sane.maniac.mg.operands.Operands;
import com.sane.maniac.mg.typeconversions.CastingAndTypeConversion;

public class MainClass {
    public static void main(String[] args) {
        DataTypes.dataInference();

        // TODO: look into instanceof operator, should consider moving to future Classes and Objects section
        // TODO: look into decrement and increment operators in more detail
        // TODO: look into ternary operators in more detail
        // TODO: look into bitwise and bit shift operators in more detail
    }

    public static void callDataTypeMethods() {
        DataTypes.primitiveDataTypes();
        DataTypes.stringDataType();
        DataTypes.stringBufferAndStringBuilder();
        DataTypes.dataInference();
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
