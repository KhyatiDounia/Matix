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
  public static final QueryField MODULE_YOUNG = field("moduleYoung");
  public static final QueryField MODULE_CISAILLEMENT = field("moduleCisaillement");
  private final @ModelField(targetType="ID", isRequired = true) String id;
  private final @ModelField(targetType="ID", isRequired = true) String name;
  private final @ModelField(targetType="Float", isRequired = true) Float moduleYoung;
  private final @ModelField(targetType="Float", isRequired = true) Float moduleCisaillement;
  public String getId() {
      return id;
  }
  
  public String getName() {
      return name;
  }
  
  public Float getModuleYoung() {
      return moduleYoung;
  }
  
  public Float getModuleCisaillement() {
      return moduleCisaillement;
  }
  
  private ProprietesMecaniques(String id, String name, Float moduleYoung, Float moduleCisaillement) {
    this.id = id;
    this.name = name;
    this.moduleYoung = moduleYoung;
    this.moduleCisaillement = moduleCisaillement;
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
              ObjectsCompat.equals(getModuleYoung(), proprietesMecaniques.getModuleYoung()) &&
              ObjectsCompat.equals(getModuleCisaillement(), proprietesMecaniques.getModuleCisaillement());
      }
  }
  
  @Override
   public int hashCode() {
    return new StringBuilder()
      .append(getId())
      .append(getName())
      .append(getModuleYoung())
      .append(getModuleCisaillement())
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
      null
    );
  }
  
  public CopyOfBuilder copyOfBuilder() {
    return new CopyOfBuilder(id,
      name,
      moduleYoung,
      moduleCisaillement);
  }
  public interface NameStep {
    ModuleYoungStep name(String name);
  }
  

  public interface ModuleYoungStep {
    ModuleCisaillementStep moduleYoung(Float moduleYoung);
  }
  

  public interface ModuleCisaillementStep {
    BuildStep moduleCisaillement(Float moduleCisaillement);
  }
  

  public interface BuildStep {
    ProprietesMecaniques build();
    BuildStep id(String id) throws IllegalArgumentException;
  }
  

  public static class Builder implements NameStep, ModuleYoungStep, ModuleCisaillementStep, BuildStep {
    private String id;
    private String name;
    private Float moduleYoung;
    private Float moduleCisaillement;
    @Override
     public ProprietesMecaniques build() {
        String id = this.id != null ? this.id : UUID.randomUUID().toString();
        
        return new ProprietesMecaniques(
          id,
          name,
          moduleYoung,
          moduleCisaillement);
    }
    
    @Override
     public ModuleYoungStep name(String name) {
        Objects.requireNonNull(name);
        this.name = name;
        return this;
    }
    
    @Override
     public ModuleCisaillementStep moduleYoung(Float moduleYoung) {
        Objects.requireNonNull(moduleYoung);
        this.moduleYoung = moduleYoung;
        return this;
    }
    
    @Override
     public BuildStep moduleCisaillement(Float moduleCisaillement) {
        Objects.requireNonNull(moduleCisaillement);
        this.moduleCisaillement = moduleCisaillement;
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
    private CopyOfBuilder(String id, String name, Float moduleYoung, Float moduleCisaillement) {
      super.id(id);
      super.name(name)
        .moduleYoung(moduleYoung)
        .moduleCisaillement(moduleCisaillement);
    }
    
    @Override
     public CopyOfBuilder name(String name) {
      return (CopyOfBuilder) super.name(name);
    }
    
    @Override
     public CopyOfBuilder moduleYoung(Float moduleYoung) {
      return (CopyOfBuilder) super.moduleYoung(moduleYoung);
    }
    
    @Override
     public CopyOfBuilder moduleCisaillement(Float moduleCisaillement) {
      return (CopyOfBuilder) super.moduleCisaillement(moduleCisaillement);
    }
  }
  
}
