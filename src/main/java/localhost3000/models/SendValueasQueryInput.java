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
import localhost3000.utilities.JsonValue;

/**
 * This is a model class for SendValueasQueryInput type.
 */
public class SendValueasQueryInput {
    private int id;
    private JsonValue model;
    private List<JsonValue> modelArray;
    private JsonValue modelMap;

    /**
     * Default constructor.
     */
    public SendValueasQueryInput() {
    }

    /**
     * Initialization constructor.
     * @param  id  int value for id.
     * @param  model  JsonValue value for model.
     * @param  modelArray  List of JsonValue value for modelArray.
     * @param  modelMap  JsonValue value for modelMap.
     */
    public SendValueasQueryInput(
            int id,
            JsonValue model,
            List<JsonValue> modelArray,
            JsonValue modelMap) {
        this.id = id;
        this.model = model;
        this.modelArray = modelArray;
        this.modelMap = modelMap;
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
     * @return Returns the JsonValue
     */
    @JsonGetter("model")
    public JsonValue getModel() {
        return model;
    }

    /**
     * Setter for Model.
     * @param model Value for JsonValue
     */
    @JsonSetter("model")
    public void setModel(JsonValue model) {
        this.model = model;
    }

    /**
     * Getter for ModelArray.
     * @return Returns the List of JsonValue
     */
    @JsonGetter("modelArray")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<JsonValue> getModelArray() {
        return modelArray;
    }

    /**
     * Setter for ModelArray.
     * @param modelArray Value for List of JsonValue
     */
    @JsonSetter("modelArray")
    public void setModelArray(List<JsonValue> modelArray) {
        this.modelArray = modelArray;
    }

    /**
     * Getter for ModelMap.
     * @return Returns the JsonValue
     */
    @JsonGetter("modelMap")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public JsonValue getModelMap() {
        return modelMap;
    }

    /**
     * Setter for ModelMap.
     * @param modelMap Value for JsonValue
     */
    @JsonSetter("modelMap")
    public void setModelMap(JsonValue modelMap) {
        this.modelMap = modelMap;
    }

    /**
     * Converts this SendValueasQueryInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SendValueasQueryInput [" + "id=" + id + ", model=" + model + ", modelArray="
                + modelArray + ", modelMap=" + modelMap + "]";
    }

    /**
     * Builds a new {@link SendValueasQueryInput.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SendValueasQueryInput.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, model)
                .modelArray(getModelArray())
                .modelMap(getModelMap());
        return builder;
    }

    /**
     * Class to build instances of {@link SendValueasQueryInput}.
     */
    public static class Builder {
        private int id;
        private JsonValue model;
        private List<JsonValue> modelArray;
        private JsonValue modelMap;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  int value for id.
         * @param  model  JsonValue value for model.
         */
        public Builder(int id, JsonValue model) {
            this.id = id;
            this.model = model;
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
         * @param  model  JsonValue value for model.
         * @return Builder
         */
        public Builder model(JsonValue model) {
            this.model = model;
            return this;
        }

        /**
         * Setter for modelArray.
         * @param  modelArray  List of JsonValue value for modelArray.
         * @return Builder
         */
        public Builder modelArray(List<JsonValue> modelArray) {
            this.modelArray = modelArray;
            return this;
        }

        /**
         * Setter for modelMap.
         * @param  modelMap  JsonValue value for modelMap.
         * @return Builder
         */
        public Builder modelMap(JsonValue modelMap) {
            this.modelMap = modelMap;
            return this;
        }

        /**
         * Builds a new {@link SendValueasQueryInput} object using the set fields.
         * @return {@link SendValueasQueryInput}
         */
        public SendValueasQueryInput build() {
            return new SendValueasQueryInput(id, model, modelArray, modelMap);
        }
    }
}
