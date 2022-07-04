/*
 * Copyright (C) 2018-2022 Illusive Soulworks
 *
 * Construct's Armory is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * any later version.
 *
 * Construct's Armory is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with Construct's Armory.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.illusivesoulworks.constructsarmory.common.modifier;

import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public interface IArmorUpdateModifier {

  void onUpdate(IModifierToolStack armor, EquipmentSlotType slotType, int level,
                LivingEntity living);
}
