package project.engine.quantum;

import java.util.Random;

public class Math {

    public static final Random RANDOM = new Random();
    public static final float THRESHOLD = 1E-6F;

    /**
     * Returns a random double in the intervall a=[-1;1].
     */
    public static float getDouble () {

        return ( RANDOM.nextFloat() * ( RANDOM.nextBoolean() ? 1F : -1F ) );

    }

    /**
     * Returns a random normalized vector.
     */
    public static Vector getRandomVector () {

        return new Vector( Math.getDouble() , Math.getDouble() , Math.getDouble() ).normalize();

    }

    public static float sin ( float angle ) {

        return ( float ) java.lang.Math.sin( angle );

    }

    public static float cos ( float angle ) {

        return ( float ) java.lang.Math.cos( angle );

    }

    public static float toRadians ( float angle ) {

        return ( float ) java.lang.Math.toRadians( angle );

    }

    public static float sqrt ( float value ) {

        return ( float ) java.lang.Math.sqrt( value );

    }

}