package com.amplifyframework.datastore.generated.model;


import java.util.List;
import java.util.UUID;
import java.util.Objects;

import androidx.core.util.ObjectsCompat;

import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;

import static com.amplifyframework.core.model.query.predicate.QueryField.field;

/** This is an auto generated class representing the ProprietesMecaniques type in your schema. */
@SuppressWarnings("all")
@ModelConfig(pluralName = "ProprietesMecaniques")
public final class ProprietesMecaniques implements Model {
  public static final QueryField ID = field("id");
  public static final QueryField NAME = field("name");
  public static final QueryField MODULE_CISAILLEMENT_MINIMAL = field("moduleCisaillementMinimal");
  public static final QueryField MODULE_CISAILLEMENT_MAXIMAL = field("moduleCisaillementMaximal");
  public static final QueryField MODULE_YOUNG_MINIMAL = field("moduleYoungMinimal");
  public static final QueryField MODULE_YOUNG_MAXIMAL = field("moduleYoungMaximal");
  public static final QueryField MODULE_COMPRESSIBILITE_MINIMAL = field("moduleCompressibiliteMinimal");
  public static final QueryField MODULE_COMPRESSIBILITE_MAXIMAL = field("moduleCompressibiliteMaximal");
  public static final QueryField COEFFICIENT_POISSON_MINIMAL = field("coefficientPoissonMinimal");
  public static final QueryField COEFFICIENT_POISSON_MAXIMAL = field("coefficientPoissonMaximal");
  public static final QueryField LIMITE_ELASTIQUE_MINIMAL = field("limiteElastiqueMinimal");
  public static final QueryField LIMITE_ELASTIQUE_MAXIMAL = field("limiteElastiqueMaximal");
  private final @ModelField(targetType="ID", isRequired = true) String id;
  private final @ModelField(targetType="ID", isRequired = true) String name;
  private final @ModelField(targetType="Float", isRequired = true) Float moduleCisaillementMinimal;
  private final @ModelField(targetType="Float", isRequired = true) Float moduleCisaillementMaximal;
  private final @ModelField(targetType="Float", isRequired = true) Float moduleYoungMinimal;
  private final @ModelField(targetType="Float", isRequired = true) Float moduleYoungMaximal;
  private final @ModelField(targetType="Float", isRequired = true) Float moduleCompressibiliteMinimal;
  private final @ModelField(targetType="Float", isRequired = true) Float moduleCompressibiliteMaximal;
  private final @ModelField(targetType="Float", isRequired = true) Float coefficientPoissonMinimal;
  private final @ModelField(targetType="Float", isRequired = true) Float coefficientPoissonMaximal;
  private final @ModelField(targetType="Float", isRequired = true) Float limiteElastiqueMinimal;
  private final @ModelField(targetType="Float", isRequired = true) Float limiteElastiqueMaximal;
  public String getId() {
      return id;
  }
  
  public String getName() {
      return name;
  }
  
  public Float getModuleCisaillementMinimal() {
      return moduleCisaillementMinimal;
  }
  
  public Float getModuleCisaillementMaximal() {
      return moduleCisaillementMaximal;
  }
  
  public Float getModuleYoungMinimal() {
      return moduleYoungMinimal;
  }
  
  public Float getModuleYoungMaximal() {
      return moduleYoungMaximal;
  }
  
  public Float getModuleCompressibiliteMinimal() {
      return moduleCompressibiliteMinimal;
  }
  
  public Float getModuleCompressibiliteMaximal() {
      return moduleCompressibiliteMaximal;
  }
  
  public Float getCoefficientPoissonMinimal() {
      return coefficientPoissonMinimal;
  }
  
  public Float getCoefficientPoissonMaximal() {
      return coefficientPoissonMaximal;
  }
  
  public Float getLimiteElastiqueMinimal() {
      return limiteElastiqueMinimal;
  }
  
  public Float getLimiteElastiqueMaximal() {
      return limiteElastiqueMaximal;
  }
  
  private ProprietesMecaniques(String id, String name, Float moduleCisaillementMinimal, Float moduleCisaillementMaximal, Float moduleYoungMinimal, Float moduleYoungMaximal, Float moduleCompressibiliteMinimal, Float moduleCompressibiliteMaximal, Float coefficientPoissonMinimal, Float coefficientPoissonMaximal, Float limiteElastiqueMinimal, Float limiteElastiqueMaximal) {
    this.id = id;
    this.name = name;
    this.moduleCisaillementMinimal = moduleCisaillementMinimal;
    this.moduleCisaillementMaximal = moduleCisaillementMaximal;
    this.moduleYoungMinimal = moduleYoungMinimal;
    this.moduleYoungMaximal = moduleYoungMaximal;
    this.moduleCompressibiliteMinimal = moduleCompressibiliteMinimal;
    this.moduleCompressibiliteMaximal = moduleCompressibiliteMaximal;
    this.coefficientPoissonMinimal = coefficientPoissonMinimal;
    this.coefficientPoissonMaximal = coefficientPoissonMaximal;
    this.limiteElastiqueMinimal = limiteElastiqueMinimal;
    this.limiteElastiqueMaximal = limiteElastiqueMaximal;
  }
  
  @Override
   public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if(obj == null || getClass() != obj.getClass()) {
        return false;
      } else {
      ProprietesMecaniques proprietesMecaniques = (ProprietesMecaniques) obj;
      return ObjectsCompat.equals(getId(), proprietesMecaniques.getId()) &&
              ObjectsCompat.equals(getName(), proprietesMecaniques.getName()) &&
              ObjectsCompat.equals(getModuleCisaillementMinimal(), proprietesMecaniques.getModuleCisaillementMinimal()) &&
              ObjectsCompat.equals(getModuleCisaillementMaximal(), proprietesMecaniques.getModuleCisaillementMaximal()) &&
              ObjectsCompat.equals(getModuleYoungMinimal(), proprietesMecaniques.getModuleYoungMinimal()) &&
              ObjectsCompat.equals(getModuleYoungMaximal(), proprietesMecaniques.getModuleYoungMaximal()) &&
              ObjectsCompat.equals(getModuleCompressibiliteMinimal(), proprietesMecaniques.getModuleCompressibiliteMinimal()) &&
              ObjectsCompat.equals(getModuleCompressibiliteMaximal(), proprietesMecaniques.getModuleCompressibiliteMaximal()) &&
              ObjectsCompat.equals(getCoefficientPoissonMinimal(), proprietesMecaniques.getCoefficientPoissonMinimal()) &&
              ObjectsCompat.equals(getCoefficientPoissonMaximal(), proprietesMecaniques.getCoefficientPoissonMaximal()) &&
              ObjectsCompat.equals(getLimiteElastiqueMinimal(), proprietesMecaniques.getLimiteElastiqueMinimal()) &&
              ObjectsCompat.equals(getLimiteElastiqueMaximal(), proprietesMecaniques.getLimiteElastiqueMaximal());
      }
  }
  
  @Override
   public int hashCode() {
    return new StringBuilder()
      .append(getId())
      .append(getName())
      .append(getModuleCisaillementMinimal())
      .append(getModuleCisaillementMaximal())
      .append(getModuleYoungMinimal())
      .append(getModuleYoungMaximal())
      .append(getModuleCompressibiliteMinimal())
      .append(getModuleCompressibiliteMaximal())
      .append(getCoefficientPoissonMinimal())
      .append(getCoefficientPoissonMaximal())
      .append(getLimiteElastiqueMinimal())
      .append(getLimiteElastiqueMaximal())
      .toString()
      .hashCode();
  }
  
  public static NameStep builder() {
      return new Builder();
  }
  
  /** 
   * WARNING: This method should not be used to build an instance of this object for a CREATE mutation.
   * This is a convenience method to return an instance of the object with only its ID populated
   * to be used in the context of a parameter in a delete mutation or referencing a foreign key
   * in a relationship.
   * @param id the id of the existing item this instance will represent
   * @return an instance of this model with only ID populated
   * @throws IllegalArgumentException Checks that ID is in the proper format
   */
  public static ProprietesMecaniques justId(String id) {
    try {
      UUID.fromString(id); // Check that ID is in the UUID format - if not an exception is thrown
    } catch (Exception exception) {
      throw new IllegalArgumentException(
              "Model IDs must be unique in the format of UUID. This method is for creating instances " +
              "of an existing object with only its ID field for sending as a mutation parameter. When " +
              "creating a new object, use the standard builder method and leave the ID field blank."
      );
    }
    return new ProprietesMecaniques(
      id,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null
    );
  }
  
  public CopyOfBuilder copyOfBuilder() {
    return new CopyOfBuilder(id,
      name,
      moduleCisaillementMinimal,
      moduleCisaillementMaximal,
      moduleYoungMinimal,
      moduleYoungMaximal,
      moduleCompressibiliteMinimal,
      moduleCompressibiliteMaximal,
      coefficientPoissonMinimal,
      coefficientPoissonMaximal,
      limiteElastiqueMinimal,
      limiteElastiqueMaximal);
  }
  public interface NameStep {
    ModuleCisaillementMinimalStep name(String name);
  }
  

  public interface ModuleCisaillementMinimalStep {
    ModuleCisaillementMaximalStep moduleCisaillementMinimal(Float moduleCisaillementMinimal);
  }
  

  public interface ModuleCisaillementMaximalStep {
    ModuleYoungMinimalStep moduleCisaillementMaximal(Float moduleCisaillementMaximal);
  }
  

  public interface ModuleYoungMinimalStep {
    ModuleYoungMaximalStep moduleYoungMinimal(Float moduleYoungMinimal);
  }
  

  public interface ModuleYoungMaximalStep {
    ModuleCompressibiliteMinimalStep moduleYoungMaximal(Float moduleYoungMaximal);
  }
  

  public interface ModuleCompressibiliteMinimalStep {
    ModuleCompressibiliteMaximalStep moduleCompressibiliteMinimal(Float moduleCompressibiliteMinimal);
  }
  

  public interface ModuleCompressibiliteMaximalStep {
    CoefficientPoissonMinimalStep moduleCompressibiliteMaximal(Float moduleCompressibiliteMaximal);
  }
  

  public interface CoefficientPoissonMinimalStep {
    CoefficientPoissonMaximalStep coefficientPoissonMinimal(Float coefficientPoissonMinimal);
  }
  

  public interface CoefficientPoissonMaximalStep {
    LimiteElastiqueMinimalStep coefficientPoissonMaximal(Float coefficientPoissonMaximal);
  }
  

  public interface LimiteElastiqueMinimalStep {
    LimiteElastiqueMaximalStep limiteElastiqueMinimal(Float limiteElastiqueMinimal);
  }
  

  public interface LimiteElastiqueMaximalStep {
    BuildStep limiteElastiqueMaximal(Float limiteElastiqueMaximal);
  }
  

  public interface BuildStep {
    ProprietesMecaniques build();
    BuildStep id(String id) throws IllegalArgumentException;
  }
  

  public static class Builder implements NameStep, ModuleCisaillementMinimalStep, ModuleCisaillementMaximalStep, ModuleYoungMinimalStep, ModuleYoungMaximalStep, ModuleCompressibiliteMinimalStep, ModuleCompressibiliteMaximalStep, CoefficientPoissonMinimalStep, CoefficientPoissonMaximalStep, LimiteElastiqueMinimalStep, LimiteElastiqueMaximalStep, BuildStep {
    private String id;
    private String name;
    private Float moduleCisaillementMinimal;
    private Float moduleCisaillementMaximal;
    private Float moduleYoungMinimal;
    private Float moduleYoungMaximal;
    private Float moduleCompressibiliteMinimal;
    private Float moduleCompressibiliteMaximal;
    private Float coefficientPoissonMinimal;
    private Float coefficientPoissonMaximal;
    private Float limiteElastiqueMinimal;
    private Float limiteElastiqueMaximal;
    @Override
     public ProprietesMecaniques build() {
        String id = this.id != null ? this.id : UUID.randomUUID().toString();
        
        return new ProprietesMecaniques(
          id,
          name,
          moduleCisaillementMinimal,
          moduleCisaillementMaximal,
          moduleYoungMinimal,
          moduleYoungMaximal,
          moduleCompressibiliteMinimal,
          moduleCompressibiliteMaximal,
          coefficientPoissonMinimal,
          coefficientPoissonMaximal,
          limiteElastiqueMinimal,
          limiteElastiqueMaximal);
    }
    
    @Override
     public ModuleCisaillementMinimalStep name(String name) {
        Objects.requireNonNull(name);
        this.name = name;
        return this;
    }
    
    @Override
     public ModuleCisaillementMaximalStep moduleCisaillementMinimal(Float moduleCisaillementMinimal) {
        Objects.requireNonNull(moduleCisaillementMinimal);
        this.moduleCisaillementMinimal = moduleCisaillementMinimal;
        return this;
    }
    
    @Override
     public ModuleYoungMinimalStep moduleCisaillementMaximal(Float moduleCisaillementMaximal) {
        Objects.requireNonNull(moduleCisaillementMaximal);
        this.moduleCisaillementMaximal = moduleCisaillementMaximal;
        return this;
    }
    
    @Override
     public ModuleYoungMaximalStep moduleYoungMinimal(Float moduleYoungMinimal) {
        Objects.requireNonNull(moduleYoungMinimal);
        this.moduleYoungMinimal = moduleYoungMinimal;
        return this;
    }
    
    @Override
     public ModuleCompressibiliteMinimalStep moduleYoungMaximal(Float moduleYoungMaximal) {
        Objects.requireNonNull(moduleYoungMaximal);
        this.moduleYoungMaximal = moduleYoungMaximal;
        return this;
    }
    
    @Override
     public ModuleCompressibiliteMaximalStep moduleCompressibiliteMinimal(Float moduleCompressibiliteMinimal) {
        Objects.requireNonNull(moduleCompressibiliteMinimal);
        this.moduleCompressibiliteMinimal = moduleCompressibiliteMinimal;
        return this;
    }
    
    @Override
     public CoefficientPoissonMinimalStep moduleCompressibiliteMaximal(Float moduleCompressibiliteMaximal) {
        Objects.requireNonNull(moduleCompressibiliteMaximal);
        this.moduleCompressibiliteMaximal = moduleCompressibiliteMaximal;
        return this;
    }
    
    @Override
     public CoefficientPoissonMaximalStep coefficientPoissonMinimal(Float coefficientPoissonMinimal) {
        Objects.requireNonNull(coefficientPoissonMinimal);
        this.coefficientPoissonMinimal = coefficientPoissonMinimal;
        return this;
    }
    
    @Override
     public LimiteElastiqueMinimalStep coefficientPoissonMaximal(Float coefficientPoissonMaximal) {
        Objects.requireNonNull(coefficientPoissonMaximal);
        this.coefficientPoissonMaximal = coefficientPoissonMaximal;
        return this;
    }
    
    @Override
     public LimiteElastiqueMaximalStep limiteElastiqueMinimal(Float limiteElastiqueMinimal) {
        Objects.requireNonNull(limiteElastiqueMinimal);
        this.limiteElastiqueMinimal = limiteElastiqueMinimal;
        return this;
    }
    
    @Override
     public BuildStep limiteElastiqueMaximal(Float limiteElastiqueMaximal) {
        Objects.requireNonNull(limiteElastiqueMaximal);
        this.limiteElastiqueMaximal = limiteElastiqueMaximal;
        return this;
    }
    
    /** 
     * WARNING: Do not set ID when creating a new object. Leave this blank and one will be auto generated for you.
     * This should only be set when referring to an already existing object.
     * @param id id
     * @return Current Builder instance, for fluent method chaining
     * @throws IllegalArgumentException Checks that ID is in the proper format
     */
    public BuildStep id(String id) throws IllegalArgumentException {
        this.id = id;
        
        try {
            UUID.fromString(id); // Check that ID is in the UUID format - if not an exception is thrown
        } catch (Exception exception) {
          throw new IllegalArgumentException("Model IDs must be unique in the format of UUID.",
                    exception);
        }
        
        return this;
    }
  }
  

  public final class CopyOfBuilder extends Builder {
    private CopyOfBuilder(String id, String name, Float moduleCisaillementMinimal, Float moduleCisaillementMaximal, Float moduleYoungMinimal, Float moduleYoungMaximal, Float moduleCompressibiliteMinimal, Float moduleCompressibiliteMaximal, Float coefficientPoissonMinimal, Float coefficientPoissonMaximal, Float limiteElastiqueMinimal, Float limiteElastiqueMaximal) {
      super.id(id);
      super.name(name)
        .moduleCisaillementMinimal(moduleCisaillementMinimal)
        .moduleCisaillementMaximal(moduleCisaillementMaximal)
        .moduleYoungMinimal(moduleYoungMinimal)
        .moduleYoungMaximal(moduleYoungMaximal)
        .moduleCompressibiliteMinimal(moduleCompressibiliteMinimal)
        .moduleCompressibiliteMaximal(moduleCompressibiliteMaximal)
        .coefficientPoissonMinimal(coefficientPoissonMinimal)
        .coefficientPoissonMaximal(coefficientPoissonMaximal)
        .limiteElastiqueMinimal(limiteElastiqueMinimal)
        .limiteElastiqueMaximal(limiteElastiqueMaximal);
    }
    
    @Override
     public CopyOfBuilder name(String name) {
      return (CopyOfBuilder) super.name(name);
    }
    
    @Override
     public CopyOfBuilder moduleCisaillementMinimal(Float moduleCisaillementMinimal) {
      return (CopyOfBuilder) super.moduleCisaillementMinimal(moduleCisaillementMinimal);
    }
    
    @Override
     public CopyOfBuilder moduleCisaillementMaximal(Float moduleCisaillementMaximal) {
      return (CopyOfBuilder) super.moduleCisaillementMaximal(moduleCisaillementMaximal);
    }
    
    @Override
     public CopyOfBuilder moduleYoungMinimal(Float moduleYoungMinimal) {
      return (CopyOfBuilder) super.moduleYoungMinimal(moduleYoungMinimal);
    }
    
    @Override
     public CopyOfBuilder moduleYoungMaximal(Float moduleYoungMaximal) {
      return (CopyOfBuilder) super.moduleYoungMaximal(moduleYoungMaximal);
    }
    
    @Override
     public CopyOfBuilder moduleCompressibiliteMinimal(Float moduleCompressibiliteMinimal) {
      return (CopyOfBuilder) super.moduleCompressibiliteMinimal(moduleCompressibiliteMinimal);
    }
    
    @Override
     public CopyOfBuilder moduleCompressibiliteMaximal(Float moduleCompressibiliteMaximal) {
      return (CopyOfBuilder) super.moduleCompressibiliteMaximal(moduleCompressibiliteMaximal);
    }
    
    @Override
     public CopyOfBuilder coefficientPoissonMinimal(Float coefficientPoissonMinimal) {
      return (CopyOfBuilder) super.coefficientPoissonMinimal(coefficientPoissonMinimal);
    }
    
    @Override
     public CopyOfBuilder coefficientPoissonMaximal(Float coefficientPoissonMaximal) {
      return (CopyOfBuilder) super.coefficientPoissonMaximal(coefficientPoissonMaximal);
    }
    
    @Override
     public CopyOfBuilder limiteElastiqueMinimal(Float limiteElastiqueMinimal) {
      return (CopyOfBuilder) super.limiteElastiqueMinimal(limiteElastiqueMinimal);
    }
    
    @Override
     public CopyOfBuilder limiteElastiqueMaximal(Float limiteElastiqueMaximal) {
      return (CopyOfBuilder) super.limiteElastiqueMaximal(limiteElastiqueMaximal);
    }
  }
  
}
