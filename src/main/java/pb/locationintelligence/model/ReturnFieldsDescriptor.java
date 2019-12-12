/**
 * Location Intelligence APIs
 * Incorporate our extensive geodata into everyday applications, business processes and workflows.
 *
 * OpenAPI spec version: 8.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package pb.locationintelligence.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * ReturnFieldsDescriptor
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-09T11:29:24.666+05:30")
public class ReturnFieldsDescriptor   {
  @SerializedName("returnAllCustomFields")
  private Boolean returnAllCustomFields = false;

  @SerializedName("returnMatchDescriptor")
  private Boolean returnMatchDescriptor = false;

  @SerializedName("returnStreetAddressFields")
  private Boolean returnStreetAddressFields = false;

  @SerializedName("returnUnitInformation")
  private Boolean returnUnitInformation = false;

  @SerializedName("returnedCustomFieldKeys")
  private List<String> returnedCustomFieldKeys = new ArrayList<String>();

  public ReturnFieldsDescriptor returnAllCustomFields(Boolean returnAllCustomFields) {
    this.returnAllCustomFields = returnAllCustomFields;
    return this;
  }

   /**
   * Get returnAllCustomFields
   * @return returnAllCustomFields
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getReturnAllCustomFields() {
    return returnAllCustomFields;
  }

  public void setReturnAllCustomFields(Boolean returnAllCustomFields) {
    this.returnAllCustomFields = returnAllCustomFields;
  }

  public ReturnFieldsDescriptor returnMatchDescriptor(Boolean returnMatchDescriptor) {
    this.returnMatchDescriptor = returnMatchDescriptor;
    return this;
  }

   /**
   * Get returnMatchDescriptor
   * @return returnMatchDescriptor
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getReturnMatchDescriptor() {
    return returnMatchDescriptor;
  }

  public void setReturnMatchDescriptor(Boolean returnMatchDescriptor) {
    this.returnMatchDescriptor = returnMatchDescriptor;
  }

  public ReturnFieldsDescriptor returnStreetAddressFields(Boolean returnStreetAddressFields) {
    this.returnStreetAddressFields = returnStreetAddressFields;
    return this;
  }

   /**
   * Get returnStreetAddressFields
   * @return returnStreetAddressFields
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getReturnStreetAddressFields() {
    return returnStreetAddressFields;
  }

  public void setReturnStreetAddressFields(Boolean returnStreetAddressFields) {
    this.returnStreetAddressFields = returnStreetAddressFields;
  }

  public ReturnFieldsDescriptor returnUnitInformation(Boolean returnUnitInformation) {
    this.returnUnitInformation = returnUnitInformation;
    return this;
  }

   /**
   * Get returnUnitInformation
   * @return returnUnitInformation
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getReturnUnitInformation() {
    return returnUnitInformation;
  }

  public void setReturnUnitInformation(Boolean returnUnitInformation) {
    this.returnUnitInformation = returnUnitInformation;
  }

  public ReturnFieldsDescriptor returnedCustomFieldKeys(List<String> returnedCustomFieldKeys) {
    this.returnedCustomFieldKeys = returnedCustomFieldKeys;
    return this;
  }

   /**
   * Get returnedCustomFieldKeys
   * @return returnedCustomFieldKeys
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getReturnedCustomFieldKeys() {
    return returnedCustomFieldKeys;
  }

  public void setReturnedCustomFieldKeys(List<String> returnedCustomFieldKeys) {
    this.returnedCustomFieldKeys = returnedCustomFieldKeys;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReturnFieldsDescriptor returnFieldsDescriptor = (ReturnFieldsDescriptor) o;
    return Objects.equals(this.returnAllCustomFields, returnFieldsDescriptor.returnAllCustomFields) &&
        Objects.equals(this.returnMatchDescriptor, returnFieldsDescriptor.returnMatchDescriptor) &&
        Objects.equals(this.returnStreetAddressFields, returnFieldsDescriptor.returnStreetAddressFields) &&
        Objects.equals(this.returnUnitInformation, returnFieldsDescriptor.returnUnitInformation) &&
        Objects.equals(this.returnedCustomFieldKeys, returnFieldsDescriptor.returnedCustomFieldKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnAllCustomFields, returnMatchDescriptor, returnStreetAddressFields, returnUnitInformation, returnedCustomFieldKeys);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnFieldsDescriptor {\n");
    
    sb.append("    returnAllCustomFields: ").append(toIndentedString(returnAllCustomFields)).append("\n");
    sb.append("    returnMatchDescriptor: ").append(toIndentedString(returnMatchDescriptor)).append("\n");
    sb.append("    returnStreetAddressFields: ").append(toIndentedString(returnStreetAddressFields)).append("\n");
    sb.append("    returnUnitInformation: ").append(toIndentedString(returnUnitInformation)).append("\n");
    sb.append("    returnedCustomFieldKeys: ").append(toIndentedString(returnedCustomFieldKeys)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

