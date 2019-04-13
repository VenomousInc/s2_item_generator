package com.github.venomousinc.itemgen.item.weapon;

import com.github.venomousinc.itemgen.DamageType;
import com.github.venomousinc.itemgen.util.StringUtils;

/**
 * An enum of Weapon Suffixes, applied to the end of the Weapon Name.
 * <p>E.G: Weapon.name + WeaponSuffix</p>
 *
 * @see Weapon
 * @see WeaponPrefix
 * @see AffixModifier
 */
public enum WeaponSuffix {
    OF_HEAT(AffixModifier.WEAK, DamageType.HEAT),
    OF_FLAMES(AffixModifier.NORMAL, DamageType.HEAT),
    OF_BURNING(AffixModifier.STRONG, DamageType.HEAT),
    OF_SEARING(AffixModifier.ENHANCED, DamageType.HEAT),
    OF_DRAGON_BREATH(AffixModifier.POWERFUL, DamageType.HEAT),
    OF_DEVILS_HELLFIRE(AffixModifier.ULTIMATE, DamageType.HEAT),

    OF_FIGURES(AffixModifier.WEAK, DamageType.SHADOW);

    /**
     * The strength of this Suffix, EG: {@link AffixModifier#ULTIMATE}.
     */
    public final AffixModifier MODIFIER;
    /**
     * The Type of Damage this Suffix does, EG: {@link DamageType#COLD}.
     */
    public final DamageType DAMAGE_TYPE;

    WeaponSuffix(final AffixModifier MODIFIER, final DamageType DAMAGE_TYPE) {
        this.MODIFIER = MODIFIER;
        this.DAMAGE_TYPE = DAMAGE_TYPE;
    }

    /**
     * Removes underscores, and applies the {@link StringUtils#capitalize(String)} function.
     * @return
     */
    public String getFixedName() {
        return StringUtils.capitalize(this.name().replace('_', ' '));
    }

    public static String getFormattedList() {
        StringBuilder sb = new StringBuilder("[Weapon Suffix]");

        for(WeaponSuffix ws : WeaponSuffix.values()) {
            sb.append( String.format("%n%d. %-10s -> %18s, Power: %s", ws.ordinal(), ws.DAMAGE_TYPE.name(), ws.name(), ws.MODIFIER.toString()));
        }

        return sb.toString();
    }

}
