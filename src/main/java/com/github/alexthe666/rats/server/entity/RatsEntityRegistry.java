package com.github.alexthe666.rats.server.entity;

import com.github.alexthe666.rats.RatsMod;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(RatsMod.MODID)
public class RatsEntityRegistry {

    public static final EntityType<EntityRat> RAT = registerEntity(EntityType.Builder.create(EntityRat::new, EntityClassification.CREATURE).size(0.49F, 0.49F), "rat");
    public static final EntityType<EntityIllagerPiper> PIED_PIPER = registerEntity(EntityType.Builder.create(EntityIllagerPiper::new, EntityClassification.MONSTER).size(0.7F, 1.8F), "pied_piper");
    public static final EntityType<EntityRatlanteanSpirit> RATLANTEAN_SPIRIT = registerEntity(EntityType.Builder.create(EntityRatlanteanSpirit::new, EntityClassification.MONSTER).size(0.5F, 0.5F), "ratlantean_spirit");
    public static final EntityType<EntityRatlanteanFlame> RATLANTEAN_FLAME = registerEntity(EntityType.Builder.create(EntityRatlanteanFlame::new, EntityClassification.MISC).size(0.5F, 0.5F).setCustomClientFactory(EntityRatlanteanFlame::new), "ratlantean_spirit_flame");
    public static final EntityType<EntityMarbleCheeseGolem> RATLANTEAN_AUTOMATON = registerEntity(EntityType.Builder.create(EntityMarbleCheeseGolem::new, EntityClassification.MONSTER).size(2F, 3.5F), "ratlantean_automaton");
    public static final EntityType<EntityGolemBeam> RATLANTEAN_AUTOMATON_BEAM = registerEntity(EntityType.Builder.create(EntityGolemBeam::new, EntityClassification.MISC).size(0.5F, 0.5F).setCustomClientFactory(EntityGolemBeam::new), "ratlantean_automaton_beam");
    public static final EntityType<EntityFeralRatlantean> FERAL_RATLANTEAN = registerEntity(EntityType.Builder.create(EntityFeralRatlantean::new, EntityClassification.MONSTER).size(1.85F, 1.2F), "feral_ratlantean");
    public static final EntityType<EntityNeoRatlantean> NEO_RATLANTEAN = registerEntity(EntityType.Builder.create(EntityNeoRatlantean::new, EntityClassification.MONSTER).size(0.8F, 1.3F), "neo_ratlantean");
    public static final EntityType<EntityLaserBeam> LASER_BEAM = registerEntity(EntityType.Builder.create(EntityLaserBeam::new, EntityClassification.MISC).size(0.5F, 0.5F).setCustomClientFactory(EntityLaserBeam::new), "laser_beam");
    public static final EntityType<EntityLaserPortal> LASER_PORTAL = registerEntity(EntityType.Builder.create(EntityLaserPortal::new, EntityClassification.MISC).size(0.95F, 0.95F).setCustomClientFactory(EntityLaserPortal::new), "laser_portal");
    public static final EntityType<EntityThrownBlock> THROWN_BLOCK = registerEntity(EntityType.Builder.create(EntityThrownBlock::new, EntityClassification.MISC).size(0.95F, 0.95F).setCustomClientFactory(EntityThrownBlock::new), "thrown_block");
    public static final EntityType<EntityVialOfSentience> VIAL_OF_SENTIENCE = registerEntity(EntityType.Builder.create(EntityVialOfSentience::new, EntityClassification.MISC).size(0.25F, 0.25F).setCustomClientFactory(EntityVialOfSentience::new), "vial_of_sentience");
    public static final EntityType<EntityPiratBoat> PIRAT_BOAT = registerEntity(EntityType.Builder.create(EntityPiratBoat::new, EntityClassification.MISC).size(1.75F, 0.8F), "pirat_boat");
    public static final EntityType<EntityPirat> PIRAT = registerEntity(EntityType.Builder.create(EntityPirat::new, EntityClassification.MONSTER).size(0.49F, 0.49F), "pirat");
    public static final EntityType<EntityCheeseCannonball> CHEESE_CANNONBALL = registerEntity(EntityType.Builder.create(EntityCheeseCannonball::new, EntityClassification.MISC).size(0.5F, 0.5F).setCustomClientFactory(EntityCheeseCannonball::new), "cheese_cannonball");
    public static final EntityType<EntityPlagueDoctor> PLAGUE_DOCTOR = registerEntity(EntityType.Builder.create(EntityPlagueDoctor::new, EntityClassification.CREATURE).size(0.8F, 1.8F), "plague_doctor");
    public static final EntityType<EntityPurifyingLiquid> PURIFYING_LIQUID = registerEntity(EntityType.Builder.create(EntityPurifyingLiquid::new, EntityClassification.MISC).size(0.5F, 0.5F).setCustomClientFactory(EntityPurifyingLiquid::new), "purifying_liquid");
    public static final EntityType<EntityBlackDeath> BLACK_DEATH = registerEntity(EntityType.Builder.create(EntityBlackDeath::new, EntityClassification.MONSTER).size(0.8F, 1.8F), "black_death");
    public static final EntityType<EntityPlagueCloud> PLAGUE_CLOUD = registerEntity(EntityType.Builder.create(EntityPlagueCloud::new, EntityClassification.MONSTER).size(0.8F, 0.8F), "plague_cloud");
    public static final EntityType<EntityPlagueBeast> PLAGUE_BEAST = registerEntity(EntityType.Builder.create(EntityPlagueBeast::new, EntityClassification.MONSTER).size(1.85F, 1.2F), "plague_beast");
    public static final EntityType<EntityPlagueShot> PLAGUE_SHOT = registerEntity(EntityType.Builder.create(EntityPlagueShot::new, EntityClassification.MISC).size(0.5F, 0.5F).setCustomClientFactory(EntityPlagueShot::new), "plague_shot");
    public static final EntityType<EntityRatCaptureNet> RAT_CAPTURE_NET = registerEntity(EntityType.Builder.create(EntityRatCaptureNet::new, EntityClassification.MISC).size(0.5F, 0.5F).setCustomClientFactory(EntityRatCaptureNet::new), "rat_capture_net");
    public static final EntityType<EntityRatDragonFire> RAT_DRAGON_FIRE = registerEntity(EntityType.Builder.create(EntityRatDragonFire::new, EntityClassification.MISC).size(0.5F, 0.5F).setCustomClientFactory(EntityRatDragonFire::new), "rat_dragon_fire");
    public static final EntityType<EntityRatArrow> RAT_ARROW = registerEntity(EntityType.Builder.create(EntityRatArrow::new, EntityClassification.MISC).size(0.5F, 0.5F).setCustomClientFactory(EntityRatArrow::new), "rat_arrow");


    private static final EntityType registerEntity(EntityType.Builder builder, String entityName){
        ResourceLocation nameLoc = new ResourceLocation(RatsMod.MODID, entityName);

        return (EntityType) builder.build(entityName).setRegistryName(nameLoc);
    }
}
