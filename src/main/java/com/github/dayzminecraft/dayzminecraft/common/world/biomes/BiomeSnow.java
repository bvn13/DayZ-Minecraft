package com.github.dayzminecraft.dayzminecraft.common.world.biomes;

import java.util.Random;

import net.minecraft.entity.passive.*;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;
import net.minecraft.world.gen.feature.WorldGenTaiga1;
import net.minecraft.world.gen.feature.WorldGenTaiga2;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeSnow extends BiomeGenBase {
  @SuppressWarnings("unchecked")
  public BiomeSnow(int id) {
    super(id);
    setColor(747097);
    temperature = BiomeGenBase.icePlains.temperature;
    rainfall = BiomeGenBase.icePlains.rainfall;
    spawnableMonsterList.clear();
    spawnableCreatureList.clear();
    spawnableWaterCreatureList.clear();
    spawnableCreatureList.add(new SpawnListEntry(EntitySheep.class, 4, 4, 4));
    spawnableCreatureList.add(new SpawnListEntry(EntityPig.class, 4, 4, 4));
    spawnableCreatureList.add(new SpawnListEntry(EntityCow.class, 4, 4, 4));
    spawnableCreatureList.add(new SpawnListEntry(EntityChicken.class, 4, 4, 4));
    spawnableCreatureList.add(new SpawnListEntry(EntityWolf.class, 4, 4, 4));
    theBiomeDecorator.treesPerChunk = 2;
    theBiomeDecorator.biome.color = 1456435;
    theBiomeDecorator.flowersPerChunk = 0;
    theBiomeDecorator.grassPerChunk = 4;
    theBiomeDecorator.deadBushPerChunk = 0;
  }

  @Override
  public WorldGenerator getRandomWorldGenForTrees(Random rand) {
    return rand.nextInt(3) == 0 ? new WorldGenTaiga1() : new WorldGenTaiga2(false);
  }
}