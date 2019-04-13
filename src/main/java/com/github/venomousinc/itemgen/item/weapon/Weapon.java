package com.github.venomousinc.itemgen.item.weapon;

import com.github.venomousinc.itemgen.item.ItemBase;

import java.util.Random;

/**
 * Extends {@link ItemBase} to add Weapon Components.
 */

public class Weapon extends ItemBase {

    /**
     * The prefix of the weapon name, and damage type, appended to the front.
     */
    private WeaponPrefix prefix;

    /**
     * The suffix of the weapon name, appended to the end.
     */
    private WeaponSuffix suffix;

    public Weapon(String name) {
        super(name);
        this.prefix = null;
        this.suffix = null;
    }

    public void setPrefix(WeaponPrefix prefix) {
        this.prefix = prefix;
    }

    public WeaponPrefix getPrefix() {
        return prefix;
    }

    public void setSuffix(WeaponSuffix suffix) {
        this.suffix = suffix;
    }

    public WeaponSuffix getSuffix() {
        return suffix;
    }

    /**
     * Get the weapon name, applying the prefix and suffix.
     * @see #setName(String)
     * @see #prefix
     * @return
     */
    @Override
    public String getName() {
        StringBuilder sb = new StringBuilder();

        if(prefix != null) {
            sb.append( String.format("%s ", prefix.getFixedName()));
        }

        sb.append(super.getName());


        if(suffix != null) {
            sb.append( String.format(" %s", suffix.getFixedName()));
        }

        return sb.toString();
    }

}
