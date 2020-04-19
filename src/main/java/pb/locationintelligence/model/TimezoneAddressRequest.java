/**
 * Location Intelligence APIs
 * Incorporate our extensive geodata into everyday applications, business processes and workflows.
 *
 * OpenAPI spec version: 8.5.0
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
import pb.locationintelligence.model.AddressTime;
import pb.locationintelligence.model.PreferencTimeZone;


/**
 * TimezoneAddressRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-16T15:55:12.092+05:30")
public class TimezoneAddressRequest   {
  @SerializedName("preferences")
  private PreferencTimeZone preferences = null;

  @SerializedName("addressTime")
  private List<AddressTime> addressTime = new ArrayList<AddressTime>();

  public TimezoneAddressRequest preferences(PreferencTimeZone preferences) {
    this.preferences = preferences;
    return this;
  }

   /**
   * Get preferences
   * @return preferences
  **/
  @ApiModelProperty(example = "null", value = "")
  public PreferencTimeZone getPreferences() {
    return preferences;
  }

  public void setPreferences(PreferencTimeZone preferences) {
    this.preferences = preferences;
  }

  public TimezoneAddressRequest addressTime(List<AddressTime> addressTime) {
    this.addressTime = addressTime;
    return this;
  }

   /**
   * Get addressTime
   * @return addressTime
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<AddressTime> getAddressTime() {
    return addressTime;
  }

  public void setAddressTime(List<AddressTime> addressTime) {
    this.addressTime = addressTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimezoneAddressRequest timezoneAddressRequest = (TimezoneAddressRequest) o;
    return Objects.equals(this.preferences, timezoneAddressRequest.preferences) &&
        Objects.equals(this.addressTime, timezoneAddressRequest.addressTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preferences, addressTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimezoneAddressRequest {\n");
    
    sb.append("    preferences: ").append(toIndentedString(preferences)).append("\n");
    sb.append("    addressTime: ").append(toIndentedString(addressTime)).append("\n");
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

