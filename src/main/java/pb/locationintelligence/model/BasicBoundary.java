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
import pb.locationintelligence.model.BoundaryPoint;
import pb.locationintelligence.model.Distance;
import pb.locationintelligence.model.PolygonGeometry;


/**
 * BasicBoundary
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-16T15:55:12.092+05:30")
public class BasicBoundary   {
  @SerializedName("center")
  private BoundaryPoint center = null;

  @SerializedName("geometry")
  private PolygonGeometry geometry = null;

  @SerializedName("distance")
  private Distance distance = null;

  public BasicBoundary center(BoundaryPoint center) {
    this.center = center;
    return this;
  }

   /**
   * Get center
   * @return center
  **/
  @ApiModelProperty(example = "null", value = "")
  public BoundaryPoint getCenter() {
    return center;
  }

  public void setCenter(BoundaryPoint center) {
    this.center = center;
  }

  public BasicBoundary geometry(PolygonGeometry geometry) {
    this.geometry = geometry;
    return this;
  }

   /**
   * Get geometry
   * @return geometry
  **/
  @ApiModelProperty(example = "null", value = "")
  public PolygonGeometry getGeometry() {
    return geometry;
  }

  public void setGeometry(PolygonGeometry geometry) {
    this.geometry = geometry;
  }

  public BasicBoundary distance(Distance distance) {
    this.distance = distance;
    return this;
  }

   /**
   * Get distance
   * @return distance
  **/
  @ApiModelProperty(example = "null", value = "")
  public Distance getDistance() {
    return distance;
  }

  public void setDistance(Distance distance) {
    this.distance = distance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BasicBoundary basicBoundary = (BasicBoundary) o;
    return Objects.equals(this.center, basicBoundary.center) &&
        Objects.equals(this.geometry, basicBoundary.geometry) &&
        Objects.equals(this.distance, basicBoundary.distance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(center, geometry, distance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BasicBoundary {\n");
    
    sb.append("    center: ").append(toIndentedString(center)).append("\n");
    sb.append("    geometry: ").append(toIndentedString(geometry)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
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

