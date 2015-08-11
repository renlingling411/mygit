/*
*Project Name: common
* File Name: EmsCountry.java
* Class Name: EmsCountry
*
* Copyright 2014 Hengtian Software Inc
*
* Licensed under the Hengtiansoft
*
* http://www.hengtiansoft.com
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
* implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.yto.globalunion.waybill.emsTransportInfo.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 *
 * @author bx
 *
 */
public enum EmsCountry {
    // 中国为CHN,台湾为TWN,香港为HKG
    CHN("中国", "China"), TWN("台湾", "Taiwan"), HKG("香港", "Hongkong");
    private String name;
    private String enName;

    private EmsCountry(String name, String enName) {
        this.name = name;
        this.enName = enName;
    }

    public String getName() {
        return name;
    }

    /**
     * @return the enName
     */
    public String getEnName() {
        return enName;
    }

    public static Map<String, String> getNameMap(String langCode) {
        Map<String, String> countries = new HashMap<String, String>();
        switch (langCode) {
        case "zh_CN":
            for (EmsCountry country : EmsCountry.values()) {
                countries.put(country.toString(), country.getName());
            }
            break;
        case "en_US":
            for (EmsCountry country : EmsCountry.values()) {
                countries.put(country.toString(), country.getEnName());
            }
            break;
        }
        return countries;
    }
}
