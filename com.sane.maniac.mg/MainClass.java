package com.sane.maniac.mg;

import com.sane.maniac.mg.datatypes.DataTypes;
import com.sane.maniac.mg.typeconversions.CastingAndTypeConversion;

public class MainClass {
    public static void main(String[] args) {
        
        
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
}
