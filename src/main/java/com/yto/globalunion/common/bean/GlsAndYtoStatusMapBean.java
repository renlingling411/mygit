/*
*Project Name: common
* File Name: GlsAndYtoStatusMaping.java
* Class Name: GlsAndYtoStatusMaping
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
package com.yto.globalunion.common.bean;

/**
 * Description:
 *
 * @author dongdongliu
 *
 */
public class GlsAndYtoStatusMapBean {
    private Long   id;
    private String EVTCODENO;
    private String EVTSNAME;
    private String EVTLNAME;
    private String REASONNO;
    private String REASONCODE;
    private String REASONNAME;
    private String YTODESC;
    private String YTOSTATUSCODE;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEVTCODENO() {
        return EVTCODENO;
    }

    public void setEVTCODENO(String eVTCODENO) {
        EVTCODENO = eVTCODENO;
    }

    public String getEVTSNAME() {
        return EVTSNAME;
    }

    public void setEVTSNAME(String eVTSNAME) {
        EVTSNAME = eVTSNAME;
    }

    public String getEVTLNAME() {
        return EVTLNAME;
    }

    public void setEVTLNAME(String eVTLNAME) {
        EVTLNAME = eVTLNAME;
    }

    public String getREASONNO() {
        return REASONNO;
    }

    public void setREASONNO(String rEASONNO) {
        REASONNO = rEASONNO;
    }

    public String getREASONCODE() {
        return REASONCODE;
    }

    public void setREASONCODE(String rEASONCODE) {
        REASONCODE = rEASONCODE;
    }

    public String getREASONNAME() {
        return REASONNAME;
    }

    public void setREASONNAME(String rEASONNAME) {
        REASONNAME = rEASONNAME;
    }

    public String getYTODESC() {
        return YTODESC;
    }

    public void setYTODESC(String yTODESC) {
        YTODESC = yTODESC;
    }

    public String getYTOSTATUSCODE() {
        return YTOSTATUSCODE;
    }

    public void setYTOSTATUSCODE(String yTOSTATUSCODE) {
        YTOSTATUSCODE = yTOSTATUSCODE;
    }
}
