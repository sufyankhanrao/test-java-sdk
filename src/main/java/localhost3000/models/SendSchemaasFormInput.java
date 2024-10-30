/*
 * JsonValueTesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;
import java.util.Map;
import localhost3000.utilities.JsonObject;

/**
 * This is a model class for SendSchemaasFormInput type.
 */
public class SendSchemaasFormInput {
    private ContentType contentType;
    private int id;
    private JsonObject model;
    private List<JsonObject> modelArray;
    private JsonObject modelMap;

    /**
     * Default constructor.
     */
    public SendSchemaasFormInput() {
    }

    /**
     * Initialization constructor.
     * @param  contentType  ContentType value for contentType.
     * @param  id  int value for id.
     * @param  model  JsonObject value for model.
     * @param  modelArray  List of JsonObject value for modelArray.
     * @param  modelMap  JsonObject value for modelMap.
     */
    public SendSchemaasFormInput(
            ContentType contentType,
            int id,
            JsonObject model,
            List<JsonObject> modelArray,
            JsonObject modelMap) {
        this.contentType = contentType;
        this.id = id;
        this.model = model;
        this.modelArray = modelArray;
        this.modelMap = modelMap;
    }

    /**
     * Getter for ContentType.
     * @return Returns the ContentType
     */
    @JsonGetter("Content-Type")
    public ContentType getContentType() {
        return contentType;
    }

    /**
     * Setter for ContentType.
     * @param contentType Value for ContentType
     */
    @JsonSetter("Content-Type")
    public void setContentType(ContentType contentType) {
        this.contentType = contentType;
    }

    /**
     * Getter for Id.
     * @return Returns the int
     */
    @JsonGetter("id")
    public int getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for int
     */
    @JsonSetter("id")
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter for Model.
     * @return Returns the JsonObject
     */
    @JsonGetter("model")
    public JsonObject getModel() {
        return model;
    }

    /**
     * Setter for Model.
     * @param model Value for JsonObject
     */
    @JsonSetter("model")
    public void setModel(JsonObject model) {
        this.model = model;
    }

    /**
     * Getter for ModelArray.
     * @return Returns the List of JsonObject
     */
    @JsonGetter("modelArray")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<JsonObject> getModelArray() {
        return modelArray;
    }

    /**
     * Setter for ModelArray.
     * @param modelArray Value for List of JsonObject
     */
    @JsonSetter("modelArray")
    public void setModelArray(List<JsonObject> modelArray) {
        this.modelArray = modelArray;
    }

    /**
     * Getter for ModelMap.
     * @return Returns the JsonObject
     */
    @JsonGetter("modelMap")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public JsonObject getModelMap() {
        return modelMap;
    }

    /**
     * Setter for ModelMap.
     * @param modelMap Value for JsonObject
     */
    @JsonSetter("modelMap")
    public void setModelMap(JsonObject modelMap) {
        this.modelMap = modelMap;
    }

    /**
     * Converts this SendSchemaasFormInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SendSchemaasFormInput [" + "contentType=" + contentType + ", id=" + id + ", model="
                + model + ", modelArray=" + modelArray + ", modelMap=" + modelMap + "]";
    }

    /**
     * Builds a new {@link SendSchemaasFormInput.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SendSchemaasFormInput.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(contentType, id, model)
                .modelArray(getModelArray())
                .modelMap(getModelMap());
        return builder;
    }

    /**
     * Class to build instances of {@link SendSchemaasFormInput}.
     */
    public static class Builder {
        private ContentType contentType;
        private int id;
        private JsonObject model;
        private List<JsonObject> modelArray;
        private JsonObject modelMap;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  contentType  ContentType value for contentType.
         * @param  id  int value for id.
         * @param  model  JsonObject value for model.
         */
        public Builder(ContentType contentType, int id, JsonObject model) {
            this.contentType = contentType;
            this.id = id;
            this.model = model;
        }

        /**
         * Setter for contentType.
         * @param  contentType  ContentType value for contentType.
         * @return Builder
         */
        public Builder contentType(ContentType contentType) {
            this.contentType = contentType;
            return this;
        }

        /**
         * Setter for id.
         * @param  id  int value for id.
         * @return Builder
         */
        public Builder id(int id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for model.
         * @param  model  JsonObject value for model.
         * @return Builder
         */
        public Builder model(JsonObject model) {
            this.model = model;
            return this;
        }

        /**
         * Setter for modelArray.
         * @param  modelArray  List of JsonObject value for modelArray.
         * @return Builder
         */
        public Builder modelArray(List<JsonObject> modelArray) {
            this.modelArray = modelArray;
            return this;
        }

        /**
         * Setter for modelMap.
         * @param  modelMap  JsonObject value for modelMap.
         * @return Builder
         */
        public Builder modelMap(JsonObject modelMap) {
            this.modelMap = modelMap;
            return this;
        }

        /**
         * Builds a new {@link SendSchemaasFormInput} object using the set fields.
         * @return {@link SendSchemaasFormInput}
         */
        public SendSchemaasFormInput build() {
            return new SendSchemaasFormInput(contentType, id, model, modelArray, modelMap);
        }
    }
}
