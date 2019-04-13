package com.github.venomousinc.itemgen.item.weapon;

import com.github.venomousinc.itemgen.util.StringUtils;

/**
 * A Modifier for Weapon Prefix, or Suffix.
 * <p>E.G: {@code (MODIFIED VALUE * STRENGTH_PERCENT) / 100}
 */

public enum AffixModifier {
    WEAK(0), NORMAL(5),
    STRONG(10), ENHANCED(20),
    POWERFUL(35), ULTIMATE(50);

    /**
     * The Percentage of how to modify the affix.
     */
    public final int STRENGTH_PERCENT;

    AffixModifier(final int STRENGTH_PERCENT) {
        this.STRENGTH_PERCENT = STRENGTH_PERCENT;
    }

    /**
     * The additional Affix Damage to add.
     *
     * @see #STRENGTH_PERCENT
     * @param affixDamage
     * @return
     */
    public int getAdditional(int affixDamage) {
        return (affixDamage * STRENGTH_PERCENT) / 100;
    }

    /**
     * Removes underscores, and applies the {@link StringUtils#capitalize(String)} function.
     * @return
     */
    public String getFixedName() {
        return StringUtils.capitalize(this.name().replace('_', ' '));
    }

    public String toString() {
        return String.format("{%s, %d%%}", this.name(), STRENGTH_PERCENT);
    }

}
