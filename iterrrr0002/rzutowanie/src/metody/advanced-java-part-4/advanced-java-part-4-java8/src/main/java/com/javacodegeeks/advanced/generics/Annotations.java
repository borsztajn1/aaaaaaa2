package com.javacodegeeks.advanced.generics;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collection;

@Target( value = ElementType.TYPE_PARAMETER )
@interface Actionable {    
}

@Target( value = ElementType.TYPE_USE )
@interface NotEmpty {    
}


public class Annotations {
    public< @Actionable T > void performAction( final T action ) {   
        // Some implementation here        
    }
    
    public static void main(String[] args) {
        final Collection< @NotEmpty String > strings = new ArrayList<>();
        // Some implementation here     
    }
}
