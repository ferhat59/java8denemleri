package Primitve;

import java.util.function.IntFunction;

public class  FuctionPrimative {
    public static void main(String[] args) {
        IntFunction<String> stringIntFunction= s-> {
            return s+ " yaşındasın";
        } ;
        System.out.println(stringIntFunction.apply(15));
    }


}
