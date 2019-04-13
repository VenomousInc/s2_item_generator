package com.github.venomousinc.itemgen.item.weapon;

import com.github.venomousinc.itemgen.DamageType;
import com.github.venomousinc.itemgen.util.StringUtils;

/**
 * An enum containing the Prefix for a weapon name.
 * <p>E.G: WeaponPrefix + Weapon.name
 *
 * @see Weapon
 * @see WeaponSuffix
 * @see AffixModifier
 */

public enum WeaponPrefix {
    HEATED(AffixModifier.WEAK, DamageType.HEAT),
    FLAME(AffixModifier.NORMAL, DamageType.HEAT),
    FIERY(AffixModifier.STRONG, DamageType.HEAT),
    ENHANCED_FIRE(AffixModifier.ENHANCED, DamageType.HEAT),
    MAGICAL_FIRE(AffixModifier.POWERFUL, DamageType.HEAT),
    ULTIMATE_FLAME(AffixModifier.ULTIMATE, DamageType.HEAT),

    CHILLED(AffixModifier.WEAK, DamageType.COLD),
    COLD(AffixModifier.NORMAL, DamageType.COLD),
    FROST(AffixModifier.STRONG, DamageType.COLD),
    FROZEN(AffixModifier.ENHANCED, DamageType.COLD),
    DEEP_FREEZE(AffixModifier.POWERFUL, DamageType.COLD),
    ULTIMATE_FREEZE(AffixModifier.ULTIMATE, DamageType.COLD),

    BLUNT(AffixModifier.WEAK, DamageType.PHYSICAL),
    FINE(AffixModifier.NORMAL, DamageType.PHYSICAL),
    SHARP(AffixModifier.STRONG, DamageType.PHYSICAL),
    SHARPENED(AffixModifier.ENHANCED, DamageType.PHYSICAL),
    RAZOR_SHARP(AffixModifier.POWERFUL, DamageType.PHYSICAL),
    DEADLY_EDGE(AffixModifier.ULTIMATE, DamageType.PHYSICAL),

    LACED(AffixModifier.WEAK, DamageType.POISON),
    POISONED(AffixModifier.NORMAL, DamageType.POISON),
    POTENT(AffixModifier.STRONG, DamageType.POISON),
    DEADLY(AffixModifier.ENHANCED, DamageType.POISON),
    VENOMOUS(AffixModifier.POWERFUL, DamageType.POISON),
    NIGHTSHADES_TOUCH(AffixModifier.ULTIMATE, DamageType.POISON),

    SPOOKED(AffixModifier.WEAK, DamageType.SHADOW),
    EERIE(AffixModifier.NORMAL, DamageType.SHADOW),
    GHOSTLY(AffixModifier.STRONG, DamageType.SHADOW),
    SHADOW(AffixModifier.ENHANCED, DamageType.SHADOW),
    DEMENTED(AffixModifier.POWERFUL, DamageType.SHADOW),
    DEMONS_TOUCH(AffixModifier.ULTIMATE, DamageType.SHADOW),

    PRIESTS(AffixModifier.WEAK, DamageType.DIVINE),
    DIVINE(AffixModifier.NORMAL, DamageType.DIVINE),
    HOLY_DIVINE(AffixModifier.STRONG, DamageType.DIVINE),
    ANGELS_DIVINE(AffixModifier.ENHANCED, DamageType.DIVINE),
    DEMIGODS_DIVINE(AffixModifier.POWERFUL, DamageType.DIVINE),
    GODS_DIVINE(AffixModifier.ULTIMATE, DamageType.DIVINE);

    /**
     * The strength of this Prefix, EG: {@link AffixModifier#ULTIMATE}.
     */
    public final AffixModifier MODIFIER;
    /**
     * The Type of Damage this Prefix does, EG: {@link DamageType#COLD}.
     */
    public final DamageType DAMAGE_TYPE;

    WeaponPrefix(final AffixModifier MODIFIER, final DamageType DAMAGE_TYPE) {
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
        StringBuilder sb = new StringBuilder("[Weapon Prefix]");

        for(WeaponPrefix wp : WeaponPrefix.values()) {
            sb.append( String.format("%n%d. %-10s -> %18s, Power: %s", wp.ordinal(), wp.DAMAGE_TYPE.name(), wp.name(), wp.MODIFIER.toString()));
        }

        return sb.toString();
    }

}
