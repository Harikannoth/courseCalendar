package com.akuacom.pss2.participant;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.akuacom.ejb.BaseEntity;
import com.akuacom.pss2.program.participant.ProgramParticipant;


@Entity
@org.hibernate.annotations.Entity(dynamicInsert = true, dynamicUpdate = true)
@Table(name = "participant_rtp_strategy")
@Cache (usage=CacheConcurrencyStrategy.TRANSACTIONAL)
public class ParticipantRtpStrategy extends BaseEntity{
	
	private static final long serialVersionUID = 1L;
	  /** The participant. */
//    @ManyToOne
//    @JoinColumn(name = "participant_uuid")
//    private Participant participant;
//    
    @ManyToOne
	@JoinColumn(name = "program_participant_uuid")
	private ProgramParticipant programParticipant;
	private String name;
	private String value0;
	private String value1;
	private String value2;
	private String value3;
	private String value4;
	private String value5;
	private String value6;
	private String value7;
	private String value8;
	private String value9;
	private String value10;
	private String value11;
	private String value12;
	private String value13;
	private String value14;
	private String value15;
	private String value16;
	private String value17;
	private String value18;
	private String value19;
	private String value20;
	private String value21;
	private String value22;
	private String value23;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue0() {
		return value0;
	}
	public void setValue0(String value0) {
		this.value0 = value0;
	}
	public String getValue1() {
		return value1;
	}
	public void setValue1(String value1) {
		this.value1 = value1;
	}
	public String getValue2() {
		return value2;
	}
	public void setValue2(String value2) {
		this.value2 = value2;
	}
	public String getValue3() {
		return value3;
	}
	public void setValue3(String value3) {
		this.value3 = value3;
	}
	public String getValue4() {
		return value4;
	}
	public void setValue4(String value4) {
		this.value4 = value4;
	}
	public String getValue5() {
		return value5;
	}
	public void setValue5(String value5) {
		this.value5 = value5;
	}
	public String getValue6() {
		return value6;
	}
	public void setValue6(String value6) {
		this.value6 = value6;
	}
	public String getValue7() {
		return value7;
	}
	public void setValue7(String value7) {
		this.value7 = value7;
	}
	public String getValue8() {
		return value8;
	}
	public void setValue8(String value8) {
		this.value8 = value8;
	}
	public String getValue9() {
		return value9;
	}
	public void setValue9(String value9) {
		this.value9 = value9;
	}
	public String getValue10() {
		return value10;
	}
	public void setValue10(String value10) {
		this.value10 = value10;
	}
	public String getValue11() {
		return value11;
	}
	public void setValue11(String value11) {
		this.value11 = value11;
	}
	public String getValue12() {
		return value12;
	}
	public void setValue12(String value12) {
		this.value12 = value12;
	}
	public String getValue13() {
		return value13;
	}
	public void setValue13(String value13) {
		this.value13 = value13;
	}
	public String getValue14() {
		return value14;
	}
	public void setValue14(String value14) {
		this.value14 = value14;
	}
	public String getValue15() {
		return value15;
	}
	public void setValue15(String value15) {
		this.value15 = value15;
	}
	public String getValue16() {
		return value16;
	}
	public void setValue16(String value16) {
		this.value16 = value16;
	}
	public String getValue17() {
		return value17;
	}
	public void setValue17(String value17) {
		this.value17 = value17;
	}
	public String getValue18() {
		return value18;
	}
	public void setValue18(String value18) {
		this.value18 = value18;
	}
	public String getValue19() {
		return value19;
	}
	public void setValue19(String value19) {
		this.value19 = value19;
	}
	public String getValue20() {
		return value20;
	}
	public void setValue20(String value20) {
		this.value20 = value20;
	}
	public String getValue21() {
		return value21;
	}
	public void setValue21(String value21) {
		this.value21 = value21;
	}
	public String getValue22() {
		return value22;
	}
	public void setValue22(String value22) {
		this.value22 = value22;
	}
	public String getValue23() {
		return value23;
	}
	public void setValue23(String value23) {
		this.value23 = value23;
	}
	public ProgramParticipant getProgramParticipant() {
		return programParticipant;
	}
	public void setProgramParticipant(ProgramParticipant programParticipant) {
		this.programParticipant = programParticipant;
	}

}
