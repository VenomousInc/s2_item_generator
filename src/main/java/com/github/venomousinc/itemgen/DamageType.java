package com.github.venomousinc.itemgen;

import com.github.venomousinc.itemgen.util.StringUtils;

/**
 * Types of Damage such as Heat, Cold, Physical and more.
 */

public enum DamageType {
    PHYSICAL, HEAT, COLD, POISON, SHADOW, DIVINE, ULTRA_VENOM;

    DamageType() {
    }

    /**
     * Removes underscores, and applies the {@link StringUtils#capitalize(String)} function.
     * @return
     */
    public String getFixedName() {
        return StringUtils.capitalize(this.name().replace('_', ' '));
    }

    @Override
    public String toString() {
        return String.format("DamageType{\"%s\" -> \"%s\")}", this.name(), this.getFixedName());
    }

    /**
     * Print out all defined Damage Types
     * @return
     */
    public static String getPrintout() {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < DamageType.values().length; i++) {
            if(i != 0) {
                sb.append(", ");
                if(i % 2 == 0) {
                    sb.append('\n');
                }
            }
            sb.append(DamageType.values()[i].toString());
        }

        return sb.toString();
    }

}
