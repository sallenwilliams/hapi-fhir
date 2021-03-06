package org.hl7.fhir.instance.model;

/*
 * #%L
 * HAPI FHIR - Core Library
 * %%
 * Copyright (C) 2014 - 2015 University Health Network
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/

// Generated on Sun, Dec 7, 2014 21:45-0500 for FHIR v0.3.0

import java.util.*;

import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.instance.model.annotations.ResourceDef;
import org.hl7.fhir.instance.model.annotations.SearchParamDefinition;
import org.hl7.fhir.instance.model.annotations.Block;
import org.hl7.fhir.instance.model.annotations.Child;
import org.hl7.fhir.instance.model.annotations.Description;
/**
 * Immunization event information.
 */
@ResourceDef(name="Immunization", profile="http://hl7.org/fhir/Profile/Immunization")
public class Immunization extends DomainResource {

    @Block()
    public static class ImmunizationExplanationComponent extends BackboneElement {
        /**
         * Reasons why a vaccine was administered.
         */
        @Child(name="reason", type={CodeableConcept.class}, order=1, min=0, max=Child.MAX_UNLIMITED)
        @Description(shortDefinition="Why immunization occurred", formalDefinition="Reasons why a vaccine was administered." )
        protected List<CodeableConcept> reason;

        /**
         * Refusal or exemption reasons.
         */
        @Child(name="refusalReason", type={CodeableConcept.class}, order=2, min=0, max=Child.MAX_UNLIMITED)
        @Description(shortDefinition="Why immunization did not occur", formalDefinition="Refusal or exemption reasons." )
        protected List<CodeableConcept> refusalReason;

        private static final long serialVersionUID = 1023767180L;

      public ImmunizationExplanationComponent() {
        super();
      }

        /**
         * @return {@link #reason} (Reasons why a vaccine was administered.)
         */
        public List<CodeableConcept> getReason() { 
          if (this.reason == null)
            this.reason = new ArrayList<CodeableConcept>();
          return this.reason;
        }

        public boolean hasReason() { 
          if (this.reason == null)
            return false;
          for (CodeableConcept item : this.reason)
            if (!item.isEmpty())
              return true;
          return false;
        }

        /**
         * @return {@link #reason} (Reasons why a vaccine was administered.)
         */
    // syntactic sugar
        public CodeableConcept addReason() { //3
          CodeableConcept t = new CodeableConcept();
          if (this.reason == null)
            this.reason = new ArrayList<CodeableConcept>();
          this.reason.add(t);
          return t;
        }

        /**
         * @return {@link #refusalReason} (Refusal or exemption reasons.)
         */
        public List<CodeableConcept> getRefusalReason() { 
          if (this.refusalReason == null)
            this.refusalReason = new ArrayList<CodeableConcept>();
          return this.refusalReason;
        }

        public boolean hasRefusalReason() { 
          if (this.refusalReason == null)
            return false;
          for (CodeableConcept item : this.refusalReason)
            if (!item.isEmpty())
              return true;
          return false;
        }

        /**
         * @return {@link #refusalReason} (Refusal or exemption reasons.)
         */
    // syntactic sugar
        public CodeableConcept addRefusalReason() { //3
          CodeableConcept t = new CodeableConcept();
          if (this.refusalReason == null)
            this.refusalReason = new ArrayList<CodeableConcept>();
          this.refusalReason.add(t);
          return t;
        }

        protected void listChildren(List<Property> childrenList) {
          super.listChildren(childrenList);
          childrenList.add(new Property("reason", "CodeableConcept", "Reasons why a vaccine was administered.", 0, java.lang.Integer.MAX_VALUE, reason));
          childrenList.add(new Property("refusalReason", "CodeableConcept", "Refusal or exemption reasons.", 0, java.lang.Integer.MAX_VALUE, refusalReason));
        }

      public ImmunizationExplanationComponent copy() {
        ImmunizationExplanationComponent dst = new ImmunizationExplanationComponent();
        copyValues(dst);
        if (reason != null) {
          dst.reason = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : reason)
            dst.reason.add(i.copy());
        };
        if (refusalReason != null) {
          dst.refusalReason = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : refusalReason)
            dst.refusalReason.add(i.copy());
        };
        return dst;
      }

      public boolean isEmpty() {
        return super.isEmpty() && (reason == null || reason.isEmpty()) && (refusalReason == null || refusalReason.isEmpty())
          ;
      }

  }

    @Block()
    public static class ImmunizationReactionComponent extends BackboneElement {
        /**
         * Date of reaction to the immunization.
         */
        @Child(name="date", type={DateTimeType.class}, order=1, min=0, max=1)
        @Description(shortDefinition="When did reaction start?", formalDefinition="Date of reaction to the immunization." )
        protected DateTimeType date;

        /**
         * Details of the reaction.
         */
        @Child(name="detail", type={Observation.class}, order=2, min=0, max=1)
        @Description(shortDefinition="Additional information on reaction", formalDefinition="Details of the reaction." )
        protected Reference detail;

        /**
         * The actual object that is the target of the reference (Details of the reaction.)
         */
        protected Observation detailTarget;

        /**
         * Self-reported indicator.
         */
        @Child(name="reported", type={BooleanType.class}, order=3, min=0, max=1)
        @Description(shortDefinition="Was reaction self-reported?", formalDefinition="Self-reported indicator." )
        protected BooleanType reported;

        private static final long serialVersionUID = -1297668556L;

      public ImmunizationReactionComponent() {
        super();
      }

        /**
         * @return {@link #date} (Date of reaction to the immunization.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
         */
        public DateTimeType getDateElement() { 
          if (this.date == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ImmunizationReactionComponent.date");
            else if (Configuration.doAutoCreate())
              this.date = new DateTimeType();
          return this.date;
        }

        public boolean hasDateElement() { 
          return this.date != null && !this.date.isEmpty();
        }

        public boolean hasDate() { 
          return this.date != null && !this.date.isEmpty();
        }

        /**
         * @param value {@link #date} (Date of reaction to the immunization.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
         */
        public ImmunizationReactionComponent setDateElement(DateTimeType value) { 
          this.date = value;
          return this;
        }

        /**
         * @return Date of reaction to the immunization.
         */
        public Date getDate() { 
          return this.date == null ? null : this.date.getValue();
        }

        /**
         * @param value Date of reaction to the immunization.
         */
        public ImmunizationReactionComponent setDate(Date value) { 
          if (value == null)
            this.date = null;
          else {
            if (this.date == null)
              this.date = new DateTimeType();
            this.date.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #detail} (Details of the reaction.)
         */
        public Reference getDetail() { 
          if (this.detail == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ImmunizationReactionComponent.detail");
            else if (Configuration.doAutoCreate())
              this.detail = new Reference();
          return this.detail;
        }

        public boolean hasDetail() { 
          return this.detail != null && !this.detail.isEmpty();
        }

        /**
         * @param value {@link #detail} (Details of the reaction.)
         */
        public ImmunizationReactionComponent setDetail(Reference value) { 
          this.detail = value;
          return this;
        }

        /**
         * @return {@link #detail} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Details of the reaction.)
         */
        public Observation getDetailTarget() { 
          if (this.detailTarget == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ImmunizationReactionComponent.detail");
            else if (Configuration.doAutoCreate())
              this.detailTarget = new Observation();
          return this.detailTarget;
        }

        /**
         * @param value {@link #detail} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Details of the reaction.)
         */
        public ImmunizationReactionComponent setDetailTarget(Observation value) { 
          this.detailTarget = value;
          return this;
        }

        /**
         * @return {@link #reported} (Self-reported indicator.). This is the underlying object with id, value and extensions. The accessor "getReported" gives direct access to the value
         */
        public BooleanType getReportedElement() { 
          if (this.reported == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ImmunizationReactionComponent.reported");
            else if (Configuration.doAutoCreate())
              this.reported = new BooleanType();
          return this.reported;
        }

        public boolean hasReportedElement() { 
          return this.reported != null && !this.reported.isEmpty();
        }

        public boolean hasReported() { 
          return this.reported != null && !this.reported.isEmpty();
        }

        /**
         * @param value {@link #reported} (Self-reported indicator.). This is the underlying object with id, value and extensions. The accessor "getReported" gives direct access to the value
         */
        public ImmunizationReactionComponent setReportedElement(BooleanType value) { 
          this.reported = value;
          return this;
        }

        /**
         * @return Self-reported indicator.
         */
        public boolean getReported() { 
          return this.reported == null ? false : this.reported.getValue();
        }

        /**
         * @param value Self-reported indicator.
         */
        public ImmunizationReactionComponent setReported(boolean value) { 
          if (value == false)
            this.reported = null;
          else {
            if (this.reported == null)
              this.reported = new BooleanType();
            this.reported.setValue(value);
          }
          return this;
        }

        protected void listChildren(List<Property> childrenList) {
          super.listChildren(childrenList);
          childrenList.add(new Property("date", "dateTime", "Date of reaction to the immunization.", 0, java.lang.Integer.MAX_VALUE, date));
          childrenList.add(new Property("detail", "Reference(Observation)", "Details of the reaction.", 0, java.lang.Integer.MAX_VALUE, detail));
          childrenList.add(new Property("reported", "boolean", "Self-reported indicator.", 0, java.lang.Integer.MAX_VALUE, reported));
        }

      public ImmunizationReactionComponent copy() {
        ImmunizationReactionComponent dst = new ImmunizationReactionComponent();
        copyValues(dst);
        dst.date = date == null ? null : date.copy();
        dst.detail = detail == null ? null : detail.copy();
        dst.reported = reported == null ? null : reported.copy();
        return dst;
      }

      public boolean isEmpty() {
        return super.isEmpty() && (date == null || date.isEmpty()) && (detail == null || detail.isEmpty())
           && (reported == null || reported.isEmpty());
      }

  }

    @Block()
    public static class ImmunizationVaccinationProtocolComponent extends BackboneElement {
        /**
         * Nominal position in a series.
         */
        @Child(name="doseSequence", type={IntegerType.class}, order=1, min=1, max=1)
        @Description(shortDefinition="What dose number within series?", formalDefinition="Nominal position in a series." )
        protected IntegerType doseSequence;

        /**
         * Contains the description about the protocol under which the vaccine was administered.
         */
        @Child(name="description", type={StringType.class}, order=2, min=0, max=1)
        @Description(shortDefinition="Details of vaccine protocol", formalDefinition="Contains the description about the protocol under which the vaccine was administered." )
        protected StringType description;

        /**
         * Indicates the authority who published the protocol?  E.g. ACIP.
         */
        @Child(name="authority", type={Organization.class}, order=3, min=0, max=1)
        @Description(shortDefinition="Who is responsible for protocol", formalDefinition="Indicates the authority who published the protocol?  E.g. ACIP." )
        protected Reference authority;

        /**
         * The actual object that is the target of the reference (Indicates the authority who published the protocol?  E.g. ACIP.)
         */
        protected Organization authorityTarget;

        /**
         * One possible path to achieve presumed immunity against a disease - within the context of an authority.
         */
        @Child(name="series", type={StringType.class}, order=4, min=0, max=1)
        @Description(shortDefinition="Name of vaccine series", formalDefinition="One possible path to achieve presumed immunity against a disease - within the context of an authority." )
        protected StringType series;

        /**
         * The recommended number of doses to achieve immunity.
         */
        @Child(name="seriesDoses", type={IntegerType.class}, order=5, min=0, max=1)
        @Description(shortDefinition="Recommended number of doses for immunity", formalDefinition="The recommended number of doses to achieve immunity." )
        protected IntegerType seriesDoses;

        /**
         * The targeted disease.
         */
        @Child(name="doseTarget", type={CodeableConcept.class}, order=6, min=1, max=1)
        @Description(shortDefinition="Disease immunized against", formalDefinition="The targeted disease." )
        protected CodeableConcept doseTarget;

        /**
         * Indicates if the immunization event should "count" against  the protocol.
         */
        @Child(name="doseStatus", type={CodeableConcept.class}, order=7, min=1, max=1)
        @Description(shortDefinition="Does dose count towards immunity?", formalDefinition="Indicates if the immunization event should 'count' against  the protocol." )
        protected CodeableConcept doseStatus;

        /**
         * Provides an explanation as to why a immunization event should or should not count against the protocol.
         */
        @Child(name="doseStatusReason", type={CodeableConcept.class}, order=8, min=0, max=1)
        @Description(shortDefinition="Why does does count/not count?", formalDefinition="Provides an explanation as to why a immunization event should or should not count against the protocol." )
        protected CodeableConcept doseStatusReason;

        private static final long serialVersionUID = 747305824L;

      public ImmunizationVaccinationProtocolComponent() {
        super();
      }

      public ImmunizationVaccinationProtocolComponent(IntegerType doseSequence, CodeableConcept doseTarget, CodeableConcept doseStatus) {
        super();
        this.doseSequence = doseSequence;
        this.doseTarget = doseTarget;
        this.doseStatus = doseStatus;
      }

        /**
         * @return {@link #doseSequence} (Nominal position in a series.). This is the underlying object with id, value and extensions. The accessor "getDoseSequence" gives direct access to the value
         */
        public IntegerType getDoseSequenceElement() { 
          if (this.doseSequence == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ImmunizationVaccinationProtocolComponent.doseSequence");
            else if (Configuration.doAutoCreate())
              this.doseSequence = new IntegerType();
          return this.doseSequence;
        }

        public boolean hasDoseSequenceElement() { 
          return this.doseSequence != null && !this.doseSequence.isEmpty();
        }

        public boolean hasDoseSequence() { 
          return this.doseSequence != null && !this.doseSequence.isEmpty();
        }

        /**
         * @param value {@link #doseSequence} (Nominal position in a series.). This is the underlying object with id, value and extensions. The accessor "getDoseSequence" gives direct access to the value
         */
        public ImmunizationVaccinationProtocolComponent setDoseSequenceElement(IntegerType value) { 
          this.doseSequence = value;
          return this;
        }

        /**
         * @return Nominal position in a series.
         */
        public int getDoseSequence() { 
          return this.doseSequence == null ? null : this.doseSequence.getValue();
        }

        /**
         * @param value Nominal position in a series.
         */
        public ImmunizationVaccinationProtocolComponent setDoseSequence(int value) { 
            if (this.doseSequence == null)
              this.doseSequence = new IntegerType();
            this.doseSequence.setValue(value);
          return this;
        }

        /**
         * @return {@link #description} (Contains the description about the protocol under which the vaccine was administered.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
         */
        public StringType getDescriptionElement() { 
          if (this.description == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ImmunizationVaccinationProtocolComponent.description");
            else if (Configuration.doAutoCreate())
              this.description = new StringType();
          return this.description;
        }

        public boolean hasDescriptionElement() { 
          return this.description != null && !this.description.isEmpty();
        }

        public boolean hasDescription() { 
          return this.description != null && !this.description.isEmpty();
        }

        /**
         * @param value {@link #description} (Contains the description about the protocol under which the vaccine was administered.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
         */
        public ImmunizationVaccinationProtocolComponent setDescriptionElement(StringType value) { 
          this.description = value;
          return this;
        }

        /**
         * @return Contains the description about the protocol under which the vaccine was administered.
         */
        public String getDescription() { 
          return this.description == null ? null : this.description.getValue();
        }

        /**
         * @param value Contains the description about the protocol under which the vaccine was administered.
         */
        public ImmunizationVaccinationProtocolComponent setDescription(String value) { 
          if (Utilities.noString(value))
            this.description = null;
          else {
            if (this.description == null)
              this.description = new StringType();
            this.description.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #authority} (Indicates the authority who published the protocol?  E.g. ACIP.)
         */
        public Reference getAuthority() { 
          if (this.authority == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ImmunizationVaccinationProtocolComponent.authority");
            else if (Configuration.doAutoCreate())
              this.authority = new Reference();
          return this.authority;
        }

        public boolean hasAuthority() { 
          return this.authority != null && !this.authority.isEmpty();
        }

        /**
         * @param value {@link #authority} (Indicates the authority who published the protocol?  E.g. ACIP.)
         */
        public ImmunizationVaccinationProtocolComponent setAuthority(Reference value) { 
          this.authority = value;
          return this;
        }

        /**
         * @return {@link #authority} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Indicates the authority who published the protocol?  E.g. ACIP.)
         */
        public Organization getAuthorityTarget() { 
          if (this.authorityTarget == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ImmunizationVaccinationProtocolComponent.authority");
            else if (Configuration.doAutoCreate())
              this.authorityTarget = new Organization();
          return this.authorityTarget;
        }

        /**
         * @param value {@link #authority} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Indicates the authority who published the protocol?  E.g. ACIP.)
         */
        public ImmunizationVaccinationProtocolComponent setAuthorityTarget(Organization value) { 
          this.authorityTarget = value;
          return this;
        }

        /**
         * @return {@link #series} (One possible path to achieve presumed immunity against a disease - within the context of an authority.). This is the underlying object with id, value and extensions. The accessor "getSeries" gives direct access to the value
         */
        public StringType getSeriesElement() { 
          if (this.series == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ImmunizationVaccinationProtocolComponent.series");
            else if (Configuration.doAutoCreate())
              this.series = new StringType();
          return this.series;
        }

        public boolean hasSeriesElement() { 
          return this.series != null && !this.series.isEmpty();
        }

        public boolean hasSeries() { 
          return this.series != null && !this.series.isEmpty();
        }

        /**
         * @param value {@link #series} (One possible path to achieve presumed immunity against a disease - within the context of an authority.). This is the underlying object with id, value and extensions. The accessor "getSeries" gives direct access to the value
         */
        public ImmunizationVaccinationProtocolComponent setSeriesElement(StringType value) { 
          this.series = value;
          return this;
        }

        /**
         * @return One possible path to achieve presumed immunity against a disease - within the context of an authority.
         */
        public String getSeries() { 
          return this.series == null ? null : this.series.getValue();
        }

        /**
         * @param value One possible path to achieve presumed immunity against a disease - within the context of an authority.
         */
        public ImmunizationVaccinationProtocolComponent setSeries(String value) { 
          if (Utilities.noString(value))
            this.series = null;
          else {
            if (this.series == null)
              this.series = new StringType();
            this.series.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #seriesDoses} (The recommended number of doses to achieve immunity.). This is the underlying object with id, value and extensions. The accessor "getSeriesDoses" gives direct access to the value
         */
        public IntegerType getSeriesDosesElement() { 
          if (this.seriesDoses == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ImmunizationVaccinationProtocolComponent.seriesDoses");
            else if (Configuration.doAutoCreate())
              this.seriesDoses = new IntegerType();
          return this.seriesDoses;
        }

        public boolean hasSeriesDosesElement() { 
          return this.seriesDoses != null && !this.seriesDoses.isEmpty();
        }

        public boolean hasSeriesDoses() { 
          return this.seriesDoses != null && !this.seriesDoses.isEmpty();
        }

        /**
         * @param value {@link #seriesDoses} (The recommended number of doses to achieve immunity.). This is the underlying object with id, value and extensions. The accessor "getSeriesDoses" gives direct access to the value
         */
        public ImmunizationVaccinationProtocolComponent setSeriesDosesElement(IntegerType value) { 
          this.seriesDoses = value;
          return this;
        }

        /**
         * @return The recommended number of doses to achieve immunity.
         */
        public int getSeriesDoses() { 
          return this.seriesDoses == null ? null : this.seriesDoses.getValue();
        }

        /**
         * @param value The recommended number of doses to achieve immunity.
         */
        public ImmunizationVaccinationProtocolComponent setSeriesDoses(int value) { 
          if (value == -1)
            this.seriesDoses = null;
          else {
            if (this.seriesDoses == null)
              this.seriesDoses = new IntegerType();
            this.seriesDoses.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #doseTarget} (The targeted disease.)
         */
        public CodeableConcept getDoseTarget() { 
          if (this.doseTarget == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ImmunizationVaccinationProtocolComponent.doseTarget");
            else if (Configuration.doAutoCreate())
              this.doseTarget = new CodeableConcept();
          return this.doseTarget;
        }

        public boolean hasDoseTarget() { 
          return this.doseTarget != null && !this.doseTarget.isEmpty();
        }

        /**
         * @param value {@link #doseTarget} (The targeted disease.)
         */
        public ImmunizationVaccinationProtocolComponent setDoseTarget(CodeableConcept value) { 
          this.doseTarget = value;
          return this;
        }

        /**
         * @return {@link #doseStatus} (Indicates if the immunization event should "count" against  the protocol.)
         */
        public CodeableConcept getDoseStatus() { 
          if (this.doseStatus == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ImmunizationVaccinationProtocolComponent.doseStatus");
            else if (Configuration.doAutoCreate())
              this.doseStatus = new CodeableConcept();
          return this.doseStatus;
        }

        public boolean hasDoseStatus() { 
          return this.doseStatus != null && !this.doseStatus.isEmpty();
        }

        /**
         * @param value {@link #doseStatus} (Indicates if the immunization event should "count" against  the protocol.)
         */
        public ImmunizationVaccinationProtocolComponent setDoseStatus(CodeableConcept value) { 
          this.doseStatus = value;
          return this;
        }

        /**
         * @return {@link #doseStatusReason} (Provides an explanation as to why a immunization event should or should not count against the protocol.)
         */
        public CodeableConcept getDoseStatusReason() { 
          if (this.doseStatusReason == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ImmunizationVaccinationProtocolComponent.doseStatusReason");
            else if (Configuration.doAutoCreate())
              this.doseStatusReason = new CodeableConcept();
          return this.doseStatusReason;
        }

        public boolean hasDoseStatusReason() { 
          return this.doseStatusReason != null && !this.doseStatusReason.isEmpty();
        }

        /**
         * @param value {@link #doseStatusReason} (Provides an explanation as to why a immunization event should or should not count against the protocol.)
         */
        public ImmunizationVaccinationProtocolComponent setDoseStatusReason(CodeableConcept value) { 
          this.doseStatusReason = value;
          return this;
        }

        protected void listChildren(List<Property> childrenList) {
          super.listChildren(childrenList);
          childrenList.add(new Property("doseSequence", "integer", "Nominal position in a series.", 0, java.lang.Integer.MAX_VALUE, doseSequence));
          childrenList.add(new Property("description", "string", "Contains the description about the protocol under which the vaccine was administered.", 0, java.lang.Integer.MAX_VALUE, description));
          childrenList.add(new Property("authority", "Reference(Organization)", "Indicates the authority who published the protocol?  E.g. ACIP.", 0, java.lang.Integer.MAX_VALUE, authority));
          childrenList.add(new Property("series", "string", "One possible path to achieve presumed immunity against a disease - within the context of an authority.", 0, java.lang.Integer.MAX_VALUE, series));
          childrenList.add(new Property("seriesDoses", "integer", "The recommended number of doses to achieve immunity.", 0, java.lang.Integer.MAX_VALUE, seriesDoses));
          childrenList.add(new Property("doseTarget", "CodeableConcept", "The targeted disease.", 0, java.lang.Integer.MAX_VALUE, doseTarget));
          childrenList.add(new Property("doseStatus", "CodeableConcept", "Indicates if the immunization event should 'count' against  the protocol.", 0, java.lang.Integer.MAX_VALUE, doseStatus));
          childrenList.add(new Property("doseStatusReason", "CodeableConcept", "Provides an explanation as to why a immunization event should or should not count against the protocol.", 0, java.lang.Integer.MAX_VALUE, doseStatusReason));
        }

      public ImmunizationVaccinationProtocolComponent copy() {
        ImmunizationVaccinationProtocolComponent dst = new ImmunizationVaccinationProtocolComponent();
        copyValues(dst);
        dst.doseSequence = doseSequence == null ? null : doseSequence.copy();
        dst.description = description == null ? null : description.copy();
        dst.authority = authority == null ? null : authority.copy();
        dst.series = series == null ? null : series.copy();
        dst.seriesDoses = seriesDoses == null ? null : seriesDoses.copy();
        dst.doseTarget = doseTarget == null ? null : doseTarget.copy();
        dst.doseStatus = doseStatus == null ? null : doseStatus.copy();
        dst.doseStatusReason = doseStatusReason == null ? null : doseStatusReason.copy();
        return dst;
      }

      public boolean isEmpty() {
        return super.isEmpty() && (doseSequence == null || doseSequence.isEmpty()) && (description == null || description.isEmpty())
           && (authority == null || authority.isEmpty()) && (series == null || series.isEmpty()) && (seriesDoses == null || seriesDoses.isEmpty())
           && (doseTarget == null || doseTarget.isEmpty()) && (doseStatus == null || doseStatus.isEmpty())
           && (doseStatusReason == null || doseStatusReason.isEmpty());
      }

  }

    /**
     * A unique identifier assigned to this adverse reaction record.
     */
    @Child(name="identifier", type={Identifier.class}, order=-1, min=0, max=Child.MAX_UNLIMITED)
    @Description(shortDefinition="Business identifier", formalDefinition="A unique identifier assigned to this adverse reaction record." )
    protected List<Identifier> identifier;

    /**
     * Date vaccine administered or was to be administered.
     */
    @Child(name="date", type={DateTimeType.class}, order=0, min=1, max=1)
    @Description(shortDefinition="Vaccination administration date", formalDefinition="Date vaccine administered or was to be administered." )
    protected DateTimeType date;

    /**
     * Vaccine that was administered or was to be administered.
     */
    @Child(name="vaccineType", type={CodeableConcept.class}, order=1, min=1, max=1)
    @Description(shortDefinition="Vaccine product administered", formalDefinition="Vaccine that was administered or was to be administered." )
    protected CodeableConcept vaccineType;

    /**
     * The patient to whom the vaccine was to be administered.
     */
    @Child(name="subject", type={Patient.class}, order=2, min=1, max=1)
    @Description(shortDefinition="Who was immunized?", formalDefinition="The patient to whom the vaccine was to be administered." )
    protected Reference subject;

    /**
     * The actual object that is the target of the reference (The patient to whom the vaccine was to be administered.)
     */
    protected Patient subjectTarget;

    /**
     * Indicates if the vaccination was refused.
     */
    @Child(name="refusedIndicator", type={BooleanType.class}, order=3, min=1, max=1)
    @Description(shortDefinition="Was immunization refused?", formalDefinition="Indicates if the vaccination was refused." )
    protected BooleanType refusedIndicator;

    /**
     * True if this administration was reported rather than directly administered.
     */
    @Child(name="reported", type={BooleanType.class}, order=4, min=1, max=1)
    @Description(shortDefinition="Is this a self-reported record?", formalDefinition="True if this administration was reported rather than directly administered." )
    protected BooleanType reported;

    /**
     * Clinician who administered the vaccine.
     */
    @Child(name="performer", type={Practitioner.class}, order=5, min=0, max=1)
    @Description(shortDefinition="Who administered vaccine?", formalDefinition="Clinician who administered the vaccine." )
    protected Reference performer;

    /**
     * The actual object that is the target of the reference (Clinician who administered the vaccine.)
     */
    protected Practitioner performerTarget;

    /**
     * Clinician who ordered the vaccination.
     */
    @Child(name="requester", type={Practitioner.class}, order=6, min=0, max=1)
    @Description(shortDefinition="Who ordered vaccination?", formalDefinition="Clinician who ordered the vaccination." )
    protected Reference requester;

    /**
     * The actual object that is the target of the reference (Clinician who ordered the vaccination.)
     */
    protected Practitioner requesterTarget;

    /**
     * Name of vaccine manufacturer.
     */
    @Child(name="manufacturer", type={Organization.class}, order=7, min=0, max=1)
    @Description(shortDefinition="Vaccine manufacturer", formalDefinition="Name of vaccine manufacturer." )
    protected Reference manufacturer;

    /**
     * The actual object that is the target of the reference (Name of vaccine manufacturer.)
     */
    protected Organization manufacturerTarget;

    /**
     * The service delivery location where the vaccine administration occurred.
     */
    @Child(name="location", type={Location.class}, order=8, min=0, max=1)
    @Description(shortDefinition="Where did vaccination occur?", formalDefinition="The service delivery location where the vaccine administration occurred." )
    protected Reference location;

    /**
     * The actual object that is the target of the reference (The service delivery location where the vaccine administration occurred.)
     */
    protected Location locationTarget;

    /**
     * Lot number of the  vaccine product.
     */
    @Child(name="lotNumber", type={StringType.class}, order=9, min=0, max=1)
    @Description(shortDefinition="Vaccine lot number", formalDefinition="Lot number of the  vaccine product." )
    protected StringType lotNumber;

    /**
     * Date vaccine batch expires.
     */
    @Child(name="expirationDate", type={DateType.class}, order=10, min=0, max=1)
    @Description(shortDefinition="Vaccine expiration date", formalDefinition="Date vaccine batch expires." )
    protected DateType expirationDate;

    /**
     * Body site where vaccine was administered.
     */
    @Child(name="site", type={CodeableConcept.class}, order=11, min=0, max=1)
    @Description(shortDefinition="Body site vaccine  was administered", formalDefinition="Body site where vaccine was administered." )
    protected CodeableConcept site;

    /**
     * The path by which the vaccine product is taken into the body.
     */
    @Child(name="route", type={CodeableConcept.class}, order=12, min=0, max=1)
    @Description(shortDefinition="How vaccine entered body", formalDefinition="The path by which the vaccine product is taken into the body." )
    protected CodeableConcept route;

    /**
     * The quantity of vaccine product that was administered.
     */
    @Child(name="doseQuantity", type={Quantity.class}, order=13, min=0, max=1)
    @Description(shortDefinition="Amount of vaccine administered", formalDefinition="The quantity of vaccine product that was administered." )
    protected Quantity doseQuantity;

    /**
     * Reasons why a vaccine was administered or refused.
     */
    @Child(name="explanation", type={}, order=14, min=0, max=1)
    @Description(shortDefinition="Administration / refusal reasons", formalDefinition="Reasons why a vaccine was administered or refused." )
    protected ImmunizationExplanationComponent explanation;

    /**
     * Categorical data indicating that an adverse event is associated in time to an immunization.
     */
    @Child(name="reaction", type={}, order=15, min=0, max=Child.MAX_UNLIMITED)
    @Description(shortDefinition="Details of a reaction that follows immunization", formalDefinition="Categorical data indicating that an adverse event is associated in time to an immunization." )
    protected List<ImmunizationReactionComponent> reaction;

    /**
     * Contains information about the protocol(s) under which the vaccine was administered.
     */
    @Child(name="vaccinationProtocol", type={}, order=16, min=0, max=Child.MAX_UNLIMITED)
    @Description(shortDefinition="What protocol was followed", formalDefinition="Contains information about the protocol(s) under which the vaccine was administered." )
    protected List<ImmunizationVaccinationProtocolComponent> vaccinationProtocol;

    private static final long serialVersionUID = -1398570384L;

    public Immunization() {
      super();
    }

    public Immunization(DateTimeType date, CodeableConcept vaccineType, Reference subject, BooleanType refusedIndicator, BooleanType reported) {
      super();
      this.date = date;
      this.vaccineType = vaccineType;
      this.subject = subject;
      this.refusedIndicator = refusedIndicator;
      this.reported = reported;
    }

    /**
     * @return {@link #identifier} (A unique identifier assigned to this adverse reaction record.)
     */
    public List<Identifier> getIdentifier() { 
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      return this.identifier;
    }

    public boolean hasIdentifier() { 
      if (this.identifier == null)
        return false;
      for (Identifier item : this.identifier)
        if (!item.isEmpty())
          return true;
      return false;
    }

    /**
     * @return {@link #identifier} (A unique identifier assigned to this adverse reaction record.)
     */
    // syntactic sugar
    public Identifier addIdentifier() { //3
      Identifier t = new Identifier();
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      this.identifier.add(t);
      return t;
    }

    /**
     * @return {@link #date} (Date vaccine administered or was to be administered.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public DateTimeType getDateElement() { 
      if (this.date == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Immunization.date");
        else if (Configuration.doAutoCreate())
          this.date = new DateTimeType();
      return this.date;
    }

    public boolean hasDateElement() { 
      return this.date != null && !this.date.isEmpty();
    }

    public boolean hasDate() { 
      return this.date != null && !this.date.isEmpty();
    }

    /**
     * @param value {@link #date} (Date vaccine administered or was to be administered.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public Immunization setDateElement(DateTimeType value) { 
      this.date = value;
      return this;
    }

    /**
     * @return Date vaccine administered or was to be administered.
     */
    public Date getDate() { 
      return this.date == null ? null : this.date.getValue();
    }

    /**
     * @param value Date vaccine administered or was to be administered.
     */
    public Immunization setDate(Date value) { 
        if (this.date == null)
          this.date = new DateTimeType();
        this.date.setValue(value);
      return this;
    }

    /**
     * @return {@link #vaccineType} (Vaccine that was administered or was to be administered.)
     */
    public CodeableConcept getVaccineType() { 
      if (this.vaccineType == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Immunization.vaccineType");
        else if (Configuration.doAutoCreate())
          this.vaccineType = new CodeableConcept();
      return this.vaccineType;
    }

    public boolean hasVaccineType() { 
      return this.vaccineType != null && !this.vaccineType.isEmpty();
    }

    /**
     * @param value {@link #vaccineType} (Vaccine that was administered or was to be administered.)
     */
    public Immunization setVaccineType(CodeableConcept value) { 
      this.vaccineType = value;
      return this;
    }

    /**
     * @return {@link #subject} (The patient to whom the vaccine was to be administered.)
     */
    public Reference getSubject() { 
      if (this.subject == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Immunization.subject");
        else if (Configuration.doAutoCreate())
          this.subject = new Reference();
      return this.subject;
    }

    public boolean hasSubject() { 
      return this.subject != null && !this.subject.isEmpty();
    }

    /**
     * @param value {@link #subject} (The patient to whom the vaccine was to be administered.)
     */
    public Immunization setSubject(Reference value) { 
      this.subject = value;
      return this;
    }

    /**
     * @return {@link #subject} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The patient to whom the vaccine was to be administered.)
     */
    public Patient getSubjectTarget() { 
      if (this.subjectTarget == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Immunization.subject");
        else if (Configuration.doAutoCreate())
          this.subjectTarget = new Patient();
      return this.subjectTarget;
    }

    /**
     * @param value {@link #subject} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The patient to whom the vaccine was to be administered.)
     */
    public Immunization setSubjectTarget(Patient value) { 
      this.subjectTarget = value;
      return this;
    }

    /**
     * @return {@link #refusedIndicator} (Indicates if the vaccination was refused.). This is the underlying object with id, value and extensions. The accessor "getRefusedIndicator" gives direct access to the value
     */
    public BooleanType getRefusedIndicatorElement() { 
      if (this.refusedIndicator == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Immunization.refusedIndicator");
        else if (Configuration.doAutoCreate())
          this.refusedIndicator = new BooleanType();
      return this.refusedIndicator;
    }

    public boolean hasRefusedIndicatorElement() { 
      return this.refusedIndicator != null && !this.refusedIndicator.isEmpty();
    }

    public boolean hasRefusedIndicator() { 
      return this.refusedIndicator != null && !this.refusedIndicator.isEmpty();
    }

    /**
     * @param value {@link #refusedIndicator} (Indicates if the vaccination was refused.). This is the underlying object with id, value and extensions. The accessor "getRefusedIndicator" gives direct access to the value
     */
    public Immunization setRefusedIndicatorElement(BooleanType value) { 
      this.refusedIndicator = value;
      return this;
    }

    /**
     * @return Indicates if the vaccination was refused.
     */
    public boolean getRefusedIndicator() { 
      return this.refusedIndicator == null ? false : this.refusedIndicator.getValue();
    }

    /**
     * @param value Indicates if the vaccination was refused.
     */
    public Immunization setRefusedIndicator(boolean value) { 
        if (this.refusedIndicator == null)
          this.refusedIndicator = new BooleanType();
        this.refusedIndicator.setValue(value);
      return this;
    }

    /**
     * @return {@link #reported} (True if this administration was reported rather than directly administered.). This is the underlying object with id, value and extensions. The accessor "getReported" gives direct access to the value
     */
    public BooleanType getReportedElement() { 
      if (this.reported == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Immunization.reported");
        else if (Configuration.doAutoCreate())
          this.reported = new BooleanType();
      return this.reported;
    }

    public boolean hasReportedElement() { 
      return this.reported != null && !this.reported.isEmpty();
    }

    public boolean hasReported() { 
      return this.reported != null && !this.reported.isEmpty();
    }

    /**
     * @param value {@link #reported} (True if this administration was reported rather than directly administered.). This is the underlying object with id, value and extensions. The accessor "getReported" gives direct access to the value
     */
    public Immunization setReportedElement(BooleanType value) { 
      this.reported = value;
      return this;
    }

    /**
     * @return True if this administration was reported rather than directly administered.
     */
    public boolean getReported() { 
      return this.reported == null ? false : this.reported.getValue();
    }

    /**
     * @param value True if this administration was reported rather than directly administered.
     */
    public Immunization setReported(boolean value) { 
        if (this.reported == null)
          this.reported = new BooleanType();
        this.reported.setValue(value);
      return this;
    }

    /**
     * @return {@link #performer} (Clinician who administered the vaccine.)
     */
    public Reference getPerformer() { 
      if (this.performer == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Immunization.performer");
        else if (Configuration.doAutoCreate())
          this.performer = new Reference();
      return this.performer;
    }

    public boolean hasPerformer() { 
      return this.performer != null && !this.performer.isEmpty();
    }

    /**
     * @param value {@link #performer} (Clinician who administered the vaccine.)
     */
    public Immunization setPerformer(Reference value) { 
      this.performer = value;
      return this;
    }

    /**
     * @return {@link #performer} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Clinician who administered the vaccine.)
     */
    public Practitioner getPerformerTarget() { 
      if (this.performerTarget == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Immunization.performer");
        else if (Configuration.doAutoCreate())
          this.performerTarget = new Practitioner();
      return this.performerTarget;
    }

    /**
     * @param value {@link #performer} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Clinician who administered the vaccine.)
     */
    public Immunization setPerformerTarget(Practitioner value) { 
      this.performerTarget = value;
      return this;
    }

    /**
     * @return {@link #requester} (Clinician who ordered the vaccination.)
     */
    public Reference getRequester() { 
      if (this.requester == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Immunization.requester");
        else if (Configuration.doAutoCreate())
          this.requester = new Reference();
      return this.requester;
    }

    public boolean hasRequester() { 
      return this.requester != null && !this.requester.isEmpty();
    }

    /**
     * @param value {@link #requester} (Clinician who ordered the vaccination.)
     */
    public Immunization setRequester(Reference value) { 
      this.requester = value;
      return this;
    }

    /**
     * @return {@link #requester} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Clinician who ordered the vaccination.)
     */
    public Practitioner getRequesterTarget() { 
      if (this.requesterTarget == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Immunization.requester");
        else if (Configuration.doAutoCreate())
          this.requesterTarget = new Practitioner();
      return this.requesterTarget;
    }

    /**
     * @param value {@link #requester} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Clinician who ordered the vaccination.)
     */
    public Immunization setRequesterTarget(Practitioner value) { 
      this.requesterTarget = value;
      return this;
    }

    /**
     * @return {@link #manufacturer} (Name of vaccine manufacturer.)
     */
    public Reference getManufacturer() { 
      if (this.manufacturer == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Immunization.manufacturer");
        else if (Configuration.doAutoCreate())
          this.manufacturer = new Reference();
      return this.manufacturer;
    }

    public boolean hasManufacturer() { 
      return this.manufacturer != null && !this.manufacturer.isEmpty();
    }

    /**
     * @param value {@link #manufacturer} (Name of vaccine manufacturer.)
     */
    public Immunization setManufacturer(Reference value) { 
      this.manufacturer = value;
      return this;
    }

    /**
     * @return {@link #manufacturer} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Name of vaccine manufacturer.)
     */
    public Organization getManufacturerTarget() { 
      if (this.manufacturerTarget == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Immunization.manufacturer");
        else if (Configuration.doAutoCreate())
          this.manufacturerTarget = new Organization();
      return this.manufacturerTarget;
    }

    /**
     * @param value {@link #manufacturer} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Name of vaccine manufacturer.)
     */
    public Immunization setManufacturerTarget(Organization value) { 
      this.manufacturerTarget = value;
      return this;
    }

    /**
     * @return {@link #location} (The service delivery location where the vaccine administration occurred.)
     */
    public Reference getLocation() { 
      if (this.location == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Immunization.location");
        else if (Configuration.doAutoCreate())
          this.location = new Reference();
      return this.location;
    }

    public boolean hasLocation() { 
      return this.location != null && !this.location.isEmpty();
    }

    /**
     * @param value {@link #location} (The service delivery location where the vaccine administration occurred.)
     */
    public Immunization setLocation(Reference value) { 
      this.location = value;
      return this;
    }

    /**
     * @return {@link #location} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The service delivery location where the vaccine administration occurred.)
     */
    public Location getLocationTarget() { 
      if (this.locationTarget == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Immunization.location");
        else if (Configuration.doAutoCreate())
          this.locationTarget = new Location();
      return this.locationTarget;
    }

    /**
     * @param value {@link #location} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The service delivery location where the vaccine administration occurred.)
     */
    public Immunization setLocationTarget(Location value) { 
      this.locationTarget = value;
      return this;
    }

    /**
     * @return {@link #lotNumber} (Lot number of the  vaccine product.). This is the underlying object with id, value and extensions. The accessor "getLotNumber" gives direct access to the value
     */
    public StringType getLotNumberElement() { 
      if (this.lotNumber == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Immunization.lotNumber");
        else if (Configuration.doAutoCreate())
          this.lotNumber = new StringType();
      return this.lotNumber;
    }

    public boolean hasLotNumberElement() { 
      return this.lotNumber != null && !this.lotNumber.isEmpty();
    }

    public boolean hasLotNumber() { 
      return this.lotNumber != null && !this.lotNumber.isEmpty();
    }

    /**
     * @param value {@link #lotNumber} (Lot number of the  vaccine product.). This is the underlying object with id, value and extensions. The accessor "getLotNumber" gives direct access to the value
     */
    public Immunization setLotNumberElement(StringType value) { 
      this.lotNumber = value;
      return this;
    }

    /**
     * @return Lot number of the  vaccine product.
     */
    public String getLotNumber() { 
      return this.lotNumber == null ? null : this.lotNumber.getValue();
    }

    /**
     * @param value Lot number of the  vaccine product.
     */
    public Immunization setLotNumber(String value) { 
      if (Utilities.noString(value))
        this.lotNumber = null;
      else {
        if (this.lotNumber == null)
          this.lotNumber = new StringType();
        this.lotNumber.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #expirationDate} (Date vaccine batch expires.). This is the underlying object with id, value and extensions. The accessor "getExpirationDate" gives direct access to the value
     */
    public DateType getExpirationDateElement() { 
      if (this.expirationDate == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Immunization.expirationDate");
        else if (Configuration.doAutoCreate())
          this.expirationDate = new DateType();
      return this.expirationDate;
    }

    public boolean hasExpirationDateElement() { 
      return this.expirationDate != null && !this.expirationDate.isEmpty();
    }

    public boolean hasExpirationDate() { 
      return this.expirationDate != null && !this.expirationDate.isEmpty();
    }

    /**
     * @param value {@link #expirationDate} (Date vaccine batch expires.). This is the underlying object with id, value and extensions. The accessor "getExpirationDate" gives direct access to the value
     */
    public Immunization setExpirationDateElement(DateType value) { 
      this.expirationDate = value;
      return this;
    }

    /**
     * @return Date vaccine batch expires.
     */
    public Date getExpirationDate() { 
      return this.expirationDate == null ? null : this.expirationDate.getValue();
    }

    /**
     * @param value Date vaccine batch expires.
     */
    public Immunization setExpirationDate(Date value) { 
      if (value == null)
        this.expirationDate = null;
      else {
        if (this.expirationDate == null)
          this.expirationDate = new DateType();
        this.expirationDate.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #site} (Body site where vaccine was administered.)
     */
    public CodeableConcept getSite() { 
      if (this.site == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Immunization.site");
        else if (Configuration.doAutoCreate())
          this.site = new CodeableConcept();
      return this.site;
    }

    public boolean hasSite() { 
      return this.site != null && !this.site.isEmpty();
    }

    /**
     * @param value {@link #site} (Body site where vaccine was administered.)
     */
    public Immunization setSite(CodeableConcept value) { 
      this.site = value;
      return this;
    }

    /**
     * @return {@link #route} (The path by which the vaccine product is taken into the body.)
     */
    public CodeableConcept getRoute() { 
      if (this.route == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Immunization.route");
        else if (Configuration.doAutoCreate())
          this.route = new CodeableConcept();
      return this.route;
    }

    public boolean hasRoute() { 
      return this.route != null && !this.route.isEmpty();
    }

    /**
     * @param value {@link #route} (The path by which the vaccine product is taken into the body.)
     */
    public Immunization setRoute(CodeableConcept value) { 
      this.route = value;
      return this;
    }

    /**
     * @return {@link #doseQuantity} (The quantity of vaccine product that was administered.)
     */
    public Quantity getDoseQuantity() { 
      if (this.doseQuantity == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Immunization.doseQuantity");
        else if (Configuration.doAutoCreate())
          this.doseQuantity = new Quantity();
      return this.doseQuantity;
    }

    public boolean hasDoseQuantity() { 
      return this.doseQuantity != null && !this.doseQuantity.isEmpty();
    }

    /**
     * @param value {@link #doseQuantity} (The quantity of vaccine product that was administered.)
     */
    public Immunization setDoseQuantity(Quantity value) { 
      this.doseQuantity = value;
      return this;
    }

    /**
     * @return {@link #explanation} (Reasons why a vaccine was administered or refused.)
     */
    public ImmunizationExplanationComponent getExplanation() { 
      if (this.explanation == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Immunization.explanation");
        else if (Configuration.doAutoCreate())
          this.explanation = new ImmunizationExplanationComponent();
      return this.explanation;
    }

    public boolean hasExplanation() { 
      return this.explanation != null && !this.explanation.isEmpty();
    }

    /**
     * @param value {@link #explanation} (Reasons why a vaccine was administered or refused.)
     */
    public Immunization setExplanation(ImmunizationExplanationComponent value) { 
      this.explanation = value;
      return this;
    }

    /**
     * @return {@link #reaction} (Categorical data indicating that an adverse event is associated in time to an immunization.)
     */
    public List<ImmunizationReactionComponent> getReaction() { 
      if (this.reaction == null)
        this.reaction = new ArrayList<ImmunizationReactionComponent>();
      return this.reaction;
    }

    public boolean hasReaction() { 
      if (this.reaction == null)
        return false;
      for (ImmunizationReactionComponent item : this.reaction)
        if (!item.isEmpty())
          return true;
      return false;
    }

    /**
     * @return {@link #reaction} (Categorical data indicating that an adverse event is associated in time to an immunization.)
     */
    // syntactic sugar
    public ImmunizationReactionComponent addReaction() { //3
      ImmunizationReactionComponent t = new ImmunizationReactionComponent();
      if (this.reaction == null)
        this.reaction = new ArrayList<ImmunizationReactionComponent>();
      this.reaction.add(t);
      return t;
    }

    /**
     * @return {@link #vaccinationProtocol} (Contains information about the protocol(s) under which the vaccine was administered.)
     */
    public List<ImmunizationVaccinationProtocolComponent> getVaccinationProtocol() { 
      if (this.vaccinationProtocol == null)
        this.vaccinationProtocol = new ArrayList<ImmunizationVaccinationProtocolComponent>();
      return this.vaccinationProtocol;
    }

    public boolean hasVaccinationProtocol() { 
      if (this.vaccinationProtocol == null)
        return false;
      for (ImmunizationVaccinationProtocolComponent item : this.vaccinationProtocol)
        if (!item.isEmpty())
          return true;
      return false;
    }

    /**
     * @return {@link #vaccinationProtocol} (Contains information about the protocol(s) under which the vaccine was administered.)
     */
    // syntactic sugar
    public ImmunizationVaccinationProtocolComponent addVaccinationProtocol() { //3
      ImmunizationVaccinationProtocolComponent t = new ImmunizationVaccinationProtocolComponent();
      if (this.vaccinationProtocol == null)
        this.vaccinationProtocol = new ArrayList<ImmunizationVaccinationProtocolComponent>();
      this.vaccinationProtocol.add(t);
      return t;
    }

      protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identifier", "Identifier", "A unique identifier assigned to this adverse reaction record.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("date", "dateTime", "Date vaccine administered or was to be administered.", 0, java.lang.Integer.MAX_VALUE, date));
        childrenList.add(new Property("vaccineType", "CodeableConcept", "Vaccine that was administered or was to be administered.", 0, java.lang.Integer.MAX_VALUE, vaccineType));
        childrenList.add(new Property("subject", "Reference(Patient)", "The patient to whom the vaccine was to be administered.", 0, java.lang.Integer.MAX_VALUE, subject));
        childrenList.add(new Property("refusedIndicator", "boolean", "Indicates if the vaccination was refused.", 0, java.lang.Integer.MAX_VALUE, refusedIndicator));
        childrenList.add(new Property("reported", "boolean", "True if this administration was reported rather than directly administered.", 0, java.lang.Integer.MAX_VALUE, reported));
        childrenList.add(new Property("performer", "Reference(Practitioner)", "Clinician who administered the vaccine.", 0, java.lang.Integer.MAX_VALUE, performer));
        childrenList.add(new Property("requester", "Reference(Practitioner)", "Clinician who ordered the vaccination.", 0, java.lang.Integer.MAX_VALUE, requester));
        childrenList.add(new Property("manufacturer", "Reference(Organization)", "Name of vaccine manufacturer.", 0, java.lang.Integer.MAX_VALUE, manufacturer));
        childrenList.add(new Property("location", "Reference(Location)", "The service delivery location where the vaccine administration occurred.", 0, java.lang.Integer.MAX_VALUE, location));
        childrenList.add(new Property("lotNumber", "string", "Lot number of the  vaccine product.", 0, java.lang.Integer.MAX_VALUE, lotNumber));
        childrenList.add(new Property("expirationDate", "date", "Date vaccine batch expires.", 0, java.lang.Integer.MAX_VALUE, expirationDate));
        childrenList.add(new Property("site", "CodeableConcept", "Body site where vaccine was administered.", 0, java.lang.Integer.MAX_VALUE, site));
        childrenList.add(new Property("route", "CodeableConcept", "The path by which the vaccine product is taken into the body.", 0, java.lang.Integer.MAX_VALUE, route));
        childrenList.add(new Property("doseQuantity", "Quantity", "The quantity of vaccine product that was administered.", 0, java.lang.Integer.MAX_VALUE, doseQuantity));
        childrenList.add(new Property("explanation", "", "Reasons why a vaccine was administered or refused.", 0, java.lang.Integer.MAX_VALUE, explanation));
        childrenList.add(new Property("reaction", "", "Categorical data indicating that an adverse event is associated in time to an immunization.", 0, java.lang.Integer.MAX_VALUE, reaction));
        childrenList.add(new Property("vaccinationProtocol", "", "Contains information about the protocol(s) under which the vaccine was administered.", 0, java.lang.Integer.MAX_VALUE, vaccinationProtocol));
      }

      public Immunization copy() {
        Immunization dst = new Immunization();
        copyValues(dst);
        if (identifier != null) {
          dst.identifier = new ArrayList<Identifier>();
          for (Identifier i : identifier)
            dst.identifier.add(i.copy());
        };
        dst.date = date == null ? null : date.copy();
        dst.vaccineType = vaccineType == null ? null : vaccineType.copy();
        dst.subject = subject == null ? null : subject.copy();
        dst.refusedIndicator = refusedIndicator == null ? null : refusedIndicator.copy();
        dst.reported = reported == null ? null : reported.copy();
        dst.performer = performer == null ? null : performer.copy();
        dst.requester = requester == null ? null : requester.copy();
        dst.manufacturer = manufacturer == null ? null : manufacturer.copy();
        dst.location = location == null ? null : location.copy();
        dst.lotNumber = lotNumber == null ? null : lotNumber.copy();
        dst.expirationDate = expirationDate == null ? null : expirationDate.copy();
        dst.site = site == null ? null : site.copy();
        dst.route = route == null ? null : route.copy();
        dst.doseQuantity = doseQuantity == null ? null : doseQuantity.copy();
        dst.explanation = explanation == null ? null : explanation.copy();
        if (reaction != null) {
          dst.reaction = new ArrayList<ImmunizationReactionComponent>();
          for (ImmunizationReactionComponent i : reaction)
            dst.reaction.add(i.copy());
        };
        if (vaccinationProtocol != null) {
          dst.vaccinationProtocol = new ArrayList<ImmunizationVaccinationProtocolComponent>();
          for (ImmunizationVaccinationProtocolComponent i : vaccinationProtocol)
            dst.vaccinationProtocol.add(i.copy());
        };
        return dst;
      }

      protected Immunization typedCopy() {
        return copy();
      }

      public boolean isEmpty() {
        return super.isEmpty() && (identifier == null || identifier.isEmpty()) && (date == null || date.isEmpty())
           && (vaccineType == null || vaccineType.isEmpty()) && (subject == null || subject.isEmpty())
           && (refusedIndicator == null || refusedIndicator.isEmpty()) && (reported == null || reported.isEmpty())
           && (performer == null || performer.isEmpty()) && (requester == null || requester.isEmpty())
           && (manufacturer == null || manufacturer.isEmpty()) && (location == null || location.isEmpty())
           && (lotNumber == null || lotNumber.isEmpty()) && (expirationDate == null || expirationDate.isEmpty())
           && (site == null || site.isEmpty()) && (route == null || route.isEmpty()) && (doseQuantity == null || doseQuantity.isEmpty())
           && (explanation == null || explanation.isEmpty()) && (reaction == null || reaction.isEmpty())
           && (vaccinationProtocol == null || vaccinationProtocol.isEmpty());
      }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.Immunization;
   }

  @SearchParamDefinition(name="reaction", path="Immunization.reaction.detail", description="Additional information on reaction", type="reference" )
  public static final String SP_REACTION = "reaction";
  @SearchParamDefinition(name="requester", path="Immunization.requester", description="The practitioner who ordered the vaccination", type="reference" )
  public static final String SP_REQUESTER = "requester";
  @SearchParamDefinition(name="dose-sequence", path="Immunization.vaccinationProtocol.doseSequence", description="What dose number within series?", type="number" )
  public static final String SP_DOSESEQUENCE = "dose-sequence";
  @SearchParamDefinition(name="vaccine-type", path="Immunization.vaccineType", description="Vaccine Product Type Administered", type="token" )
  public static final String SP_VACCINETYPE = "vaccine-type";
  @SearchParamDefinition(name="location", path="Immunization.location", description="The service delivery location or facility in which the vaccine was / was to be administered", type="reference" )
  public static final String SP_LOCATION = "location";
  @SearchParamDefinition(name="reason", path="Immunization.explanation.reason", description="Why immunization occurred", type="token" )
  public static final String SP_REASON = "reason";
  @SearchParamDefinition(name="subject", path="Immunization.subject", description="The subject of the vaccination event / refusal", type="reference" )
  public static final String SP_SUBJECT = "subject";
  @SearchParamDefinition(name="reaction-date", path="Immunization.reaction.date", description="When did reaction start?", type="date" )
  public static final String SP_REACTIONDATE = "reaction-date";
  @SearchParamDefinition(name="date", path="Immunization.date", description="Vaccination  Administration / Refusal Date", type="date" )
  public static final String SP_DATE = "date";
  @SearchParamDefinition(name="patient", path="Immunization.subject", description="The patient for the vaccination event / refusal", type="reference" )
  public static final String SP_PATIENT = "patient";
  @SearchParamDefinition(name="lot-number", path="Immunization.lotNumber", description="Vaccine Lot Number", type="string" )
  public static final String SP_LOTNUMBER = "lot-number";
  @SearchParamDefinition(name="manufacturer", path="Immunization.manufacturer", description="Vaccine Manufacturer", type="reference" )
  public static final String SP_MANUFACTURER = "manufacturer";
  @SearchParamDefinition(name="performer", path="Immunization.performer", description="The practitioner who administered the vaccination", type="reference" )
  public static final String SP_PERFORMER = "performer";
  @SearchParamDefinition(name="refusal-reason", path="Immunization.explanation.refusalReason", description="Explanation of refusal / exemption", type="token" )
  public static final String SP_REFUSALREASON = "refusal-reason";
  @SearchParamDefinition(name="refused", path="Immunization.refusedIndicator", description="Was immunization refused?", type="token" )
  public static final String SP_REFUSED = "refused";
  @SearchParamDefinition(name="identifier", path="Immunization.identifier", description="Business identifier", type="token" )
  public static final String SP_IDENTIFIER = "identifier";

}

