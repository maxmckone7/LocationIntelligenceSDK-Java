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
import pb.locationintelligence.model.MatchedAddress;
import pb.locationintelligence.model.Poi;


/**
 * Pois
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-09T11:29:24.666+05:30")
public class Pois   {
  @SerializedName("page")
  private String page = null;

  @SerializedName("candidates")
  private String candidates = null;

  @SerializedName("totalMatchingCandidates")
  private String totalMatchingCandidates = null;

  @SerializedName("poi")
  private List<Poi> poi = new ArrayList<Poi>();

  @SerializedName("matchedAddress")
  private MatchedAddress matchedAddress = null;

  public Pois page(String page) {
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPage() {
    return page;
  }

  public void setPage(String page) {
    this.page = page;
  }

  public Pois candidates(String candidates) {
    this.candidates = candidates;
    return this;
  }

   /**
   * Get candidates
   * @return candidates
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCandidates() {
    return candidates;
  }

  public void setCandidates(String candidates) {
    this.candidates = candidates;
  }

  public Pois totalMatchingCandidates(String totalMatchingCandidates) {
    this.totalMatchingCandidates = totalMatchingCandidates;
    return this;
  }

   /**
   * Get totalMatchingCandidates
   * @return totalMatchingCandidates
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTotalMatchingCandidates() {
    return totalMatchingCandidates;
  }

  public void setTotalMatchingCandidates(String totalMatchingCandidates) {
    this.totalMatchingCandidates = totalMatchingCandidates;
  }

  public Pois poi(List<Poi> poi) {
    this.poi = poi;
    return this;
  }

   /**
   * Get poi
   * @return poi
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Poi> getPoi() {
    return poi;
  }

  public void setPoi(List<Poi> poi) {
    this.poi = poi;
  }

  public Pois matchedAddress(MatchedAddress matchedAddress) {
    this.matchedAddress = matchedAddress;
    return this;
  }

   /**
   * Get matchedAddress
   * @return matchedAddress
  **/
  @ApiModelProperty(example = "null", value = "")
  public MatchedAddress getMatchedAddress() {
    return matchedAddress;
  }

  public void setMatchedAddress(MatchedAddress matchedAddress) {
    this.matchedAddress = matchedAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pois pois = (Pois) o;
    return Objects.equals(this.page, pois.page) &&
        Objects.equals(this.candidates, pois.candidates) &&
        Objects.equals(this.totalMatchingCandidates, pois.totalMatchingCandidates) &&
        Objects.equals(this.poi, pois.poi) &&
        Objects.equals(this.matchedAddress, pois.matchedAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, candidates, totalMatchingCandidates, poi, matchedAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pois {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    candidates: ").append(toIndentedString(candidates)).append("\n");
    sb.append("    totalMatchingCandidates: ").append(toIndentedString(totalMatchingCandidates)).append("\n");
    sb.append("    poi: ").append(toIndentedString(poi)).append("\n");
    sb.append("    matchedAddress: ").append(toIndentedString(matchedAddress)).append("\n");
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

