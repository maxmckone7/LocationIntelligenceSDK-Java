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


/**
 * SpeedRoad
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-16T15:55:12.092+05:30")
public class SpeedRoad   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("altName")
  private String altName = null;

  @SerializedName("roadClass")
  private String roadClass = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("lengthInMeters")
  private String lengthInMeters = null;

  @SerializedName("routeNumber")
  private String routeNumber = null;

  @SerializedName("surfaceType")
  private String surfaceType = null;

  @SerializedName("trafficFlow")
  private String trafficFlow = null;

  @SerializedName("isToll")
  private String isToll = null;

  @SerializedName("beginningLevel")
  private String beginningLevel = null;

  @SerializedName("endingLevel")
  private String endingLevel = null;

  public SpeedRoad id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SpeedRoad name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SpeedRoad altName(String altName) {
    this.altName = altName;
    return this;
  }

   /**
   * Get altName
   * @return altName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAltName() {
    return altName;
  }

  public void setAltName(String altName) {
    this.altName = altName;
  }

  public SpeedRoad roadClass(String roadClass) {
    this.roadClass = roadClass;
    return this;
  }

   /**
   * Get roadClass
   * @return roadClass
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRoadClass() {
    return roadClass;
  }

  public void setRoadClass(String roadClass) {
    this.roadClass = roadClass;
  }

  public SpeedRoad type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public SpeedRoad lengthInMeters(String lengthInMeters) {
    this.lengthInMeters = lengthInMeters;
    return this;
  }

   /**
   * Get lengthInMeters
   * @return lengthInMeters
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLengthInMeters() {
    return lengthInMeters;
  }

  public void setLengthInMeters(String lengthInMeters) {
    this.lengthInMeters = lengthInMeters;
  }

  public SpeedRoad routeNumber(String routeNumber) {
    this.routeNumber = routeNumber;
    return this;
  }

   /**
   * Get routeNumber
   * @return routeNumber
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRouteNumber() {
    return routeNumber;
  }

  public void setRouteNumber(String routeNumber) {
    this.routeNumber = routeNumber;
  }

  public SpeedRoad surfaceType(String surfaceType) {
    this.surfaceType = surfaceType;
    return this;
  }

   /**
   * Get surfaceType
   * @return surfaceType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSurfaceType() {
    return surfaceType;
  }

  public void setSurfaceType(String surfaceType) {
    this.surfaceType = surfaceType;
  }

  public SpeedRoad trafficFlow(String trafficFlow) {
    this.trafficFlow = trafficFlow;
    return this;
  }

   /**
   * Get trafficFlow
   * @return trafficFlow
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTrafficFlow() {
    return trafficFlow;
  }

  public void setTrafficFlow(String trafficFlow) {
    this.trafficFlow = trafficFlow;
  }

  public SpeedRoad isToll(String isToll) {
    this.isToll = isToll;
    return this;
  }

   /**
   * Get isToll
   * @return isToll
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIsToll() {
    return isToll;
  }

  public void setIsToll(String isToll) {
    this.isToll = isToll;
  }

  public SpeedRoad beginningLevel(String beginningLevel) {
    this.beginningLevel = beginningLevel;
    return this;
  }

   /**
   * Get beginningLevel
   * @return beginningLevel
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getBeginningLevel() {
    return beginningLevel;
  }

  public void setBeginningLevel(String beginningLevel) {
    this.beginningLevel = beginningLevel;
  }

  public SpeedRoad endingLevel(String endingLevel) {
    this.endingLevel = endingLevel;
    return this;
  }

   /**
   * Get endingLevel
   * @return endingLevel
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEndingLevel() {
    return endingLevel;
  }

  public void setEndingLevel(String endingLevel) {
    this.endingLevel = endingLevel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpeedRoad speedRoad = (SpeedRoad) o;
    return Objects.equals(this.id, speedRoad.id) &&
        Objects.equals(this.name, speedRoad.name) &&
        Objects.equals(this.altName, speedRoad.altName) &&
        Objects.equals(this.roadClass, speedRoad.roadClass) &&
        Objects.equals(this.type, speedRoad.type) &&
        Objects.equals(this.lengthInMeters, speedRoad.lengthInMeters) &&
        Objects.equals(this.routeNumber, speedRoad.routeNumber) &&
        Objects.equals(this.surfaceType, speedRoad.surfaceType) &&
        Objects.equals(this.trafficFlow, speedRoad.trafficFlow) &&
        Objects.equals(this.isToll, speedRoad.isToll) &&
        Objects.equals(this.beginningLevel, speedRoad.beginningLevel) &&
        Objects.equals(this.endingLevel, speedRoad.endingLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, altName, roadClass, type, lengthInMeters, routeNumber, surfaceType, trafficFlow, isToll, beginningLevel, endingLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpeedRoad {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    altName: ").append(toIndentedString(altName)).append("\n");
    sb.append("    roadClass: ").append(toIndentedString(roadClass)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    lengthInMeters: ").append(toIndentedString(lengthInMeters)).append("\n");
    sb.append("    routeNumber: ").append(toIndentedString(routeNumber)).append("\n");
    sb.append("    surfaceType: ").append(toIndentedString(surfaceType)).append("\n");
    sb.append("    trafficFlow: ").append(toIndentedString(trafficFlow)).append("\n");
    sb.append("    isToll: ").append(toIndentedString(isToll)).append("\n");
    sb.append("    beginningLevel: ").append(toIndentedString(beginningLevel)).append("\n");
    sb.append("    endingLevel: ").append(toIndentedString(endingLevel)).append("\n");
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

