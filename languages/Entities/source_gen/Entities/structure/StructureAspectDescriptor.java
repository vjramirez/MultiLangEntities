package Entities.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BaseStructureAspectDescriptor;
import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import java.util.Collection;
import java.util.Arrays;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2;

public class StructureAspectDescriptor extends BaseStructureAspectDescriptor {
  /*package*/ final ConceptDescriptor myConceptEntity = createDescriptorForEntity();
  /*package*/ final ConceptDescriptor myConceptRelationship = createDescriptorForRelationship();
  private final LanguageConceptSwitch myConceptIndex;

  public StructureAspectDescriptor() {
    myConceptIndex = new LanguageConceptSwitch();
  }

  @Override
  public Collection<ConceptDescriptor> getDescriptors() {
    return Arrays.asList(myConceptEntity, myConceptRelationship);
  }

  @Override
  @Nullable
  public ConceptDescriptor getDescriptor(SConceptId id) {
    switch (myConceptIndex.index(id)) {
      case LanguageConceptSwitch.Entity:
        return myConceptEntity;
      case LanguageConceptSwitch.Relationship:
        return myConceptRelationship;
      default:
        return null;
    }
  }

  /*package*/ int internalIndex(SAbstractConcept c) {
    return myConceptIndex.index(c);
  }

  private static ConceptDescriptor createDescriptorForEntity() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Entities", "Entity", 0x81baee788ceb49aaL, 0x8e77ea7539ef3920L, 0x68cb599388839d2L);
    b.class_(false, false, true);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:68f320e3-86b8-47a9-a5bf-09f35c28bf7b(Entities.structure)/471951730650134994");
    b.aggregate("relationships", 0x68cb59938883a49L).target(0x81baee788ceb49aaL, 0x8e77ea7539ef3920L, 0x68cb59938883a0aL).optional(true).ordered(true).multiple(true).origin("471951730650135113").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForRelationship() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Entities", "Relationship", 0x81baee788ceb49aaL, 0x8e77ea7539ef3920L, 0x68cb59938883a0aL);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:68f320e3-86b8-47a9-a5bf-09f35c28bf7b(Entities.structure)/471951730650135050");
    b.associate("target", 0x68cb59938883a0dL).target(0x81baee788ceb49aaL, 0x8e77ea7539ef3920L, 0x68cb599388839d2L).optional(false).origin("471951730650135053").done();
    return b.create();
  }
}