package com.popo.assimptest.common;

public class AnimationHelper {
    public static Animation getAnimation(AnimationType type){
        switch (type){
            case OPEN:
                return new OpenAnimation();
            case WALK:
                return new WalkAnimation();
            case ATTACK:
                return new AttackAnimation();
        }
        return null;
    }

}
