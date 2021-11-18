// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/resources/conversion_value_rule.proto

package com.google.ads.googleads.v8.resources;

public final class ConversionValueRuleProto {
  private ConversionValueRuleProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v8_resources_ConversionValueRule_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v8_resources_ConversionValueRule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v8_resources_ConversionValueRule_ValueRuleAction_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v8_resources_ConversionValueRule_ValueRuleAction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v8_resources_ConversionValueRule_ValueRuleGeoLocationCondition_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v8_resources_ConversionValueRule_ValueRuleGeoLocationCondition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v8_resources_ConversionValueRule_ValueRuleDeviceCondition_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v8_resources_ConversionValueRule_ValueRuleDeviceCondition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v8_resources_ConversionValueRule_ValueRuleAudienceCondition_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v8_resources_ConversionValueRule_ValueRuleAudienceCondition_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=google/ads/googleads/v8/resources/conv" +
      "ersion_value_rule.proto\022!google.ads.goog" +
      "leads.v8.resources\032@google/ads/googleads" +
      "/v8/enums/conversion_value_rule_status.p" +
      "roto\032:google/ads/googleads/v8/enums/valu" +
      "e_rule_device_type.proto\032Fgoogle/ads/goo" +
      "gleads/v8/enums/value_rule_geo_location_" +
      "match_type.proto\0328google/ads/googleads/v" +
      "8/enums/value_rule_operation.proto\032\037goog" +
      "le/api/field_behavior.proto\032\031google/api/" +
      "resource.proto\032\034google/api/annotations.p" +
      "roto\"\240\r\n\023ConversionValueRule\022K\n\rresource" +
      "_name\030\001 \001(\tB4\340A\005\372A.\n,googleads.googleapi" +
      "s.com/ConversionValueRule\022\017\n\002id\030\002 \001(\003B\003\340" +
      "A\003\022V\n\006action\030\003 \001(\0132F.google.ads.googlead" +
      "s.v8.resources.ConversionValueRule.Value" +
      "RuleAction\022t\n\026geo_location_condition\030\004 \001" +
      "(\0132T.google.ads.googleads.v8.resources.C" +
      "onversionValueRule.ValueRuleGeoLocationC" +
      "ondition\022i\n\020device_condition\030\005 \001(\0132O.goo" +
      "gle.ads.googleads.v8.resources.Conversio" +
      "nValueRule.ValueRuleDeviceCondition\022m\n\022a" +
      "udience_condition\030\006 \001(\0132Q.google.ads.goo" +
      "gleads.v8.resources.ConversionValueRule." +
      "ValueRuleAudienceCondition\022A\n\016owner_cust" +
      "omer\030\007 \001(\tB)\340A\003\372A#\n!googleads.googleapis" +
      ".com/Customer\022f\n\006status\030\010 \001(\0162V.google.a" +
      "ds.googleads.v8.enums.ConversionValueRul" +
      "eStatusEnum.ConversionValueRuleStatus\032}\n" +
      "\017ValueRuleAction\022[\n\toperation\030\001 \001(\0162H.go" +
      "ogle.ads.googleads.v8.enums.ValueRuleOpe" +
      "rationEnum.ValueRuleOperation\022\r\n\005value\030\002" +
      " \001(\001\032\277\003\n\035ValueRuleGeoLocationCondition\022V" +
      "\n\035excluded_geo_target_constants\030\001 \003(\tB/\372" +
      "A,\n*googleads.googleapis.com/GeoTargetCo" +
      "nstant\022\177\n\027excluded_geo_match_type\030\002 \001(\0162" +
      "^.google.ads.googleads.v8.enums.ValueRul" +
      "eGeoLocationMatchTypeEnum.ValueRuleGeoLo" +
      "cationMatchType\022M\n\024geo_target_constants\030" +
      "\003 \003(\tB/\372A,\n*googleads.googleapis.com/Geo" +
      "TargetConstant\022v\n\016geo_match_type\030\004 \001(\0162^" +
      ".google.ads.googleads.v8.enums.ValueRule" +
      "GeoLocationMatchTypeEnum.ValueRuleGeoLoc" +
      "ationMatchType\032|\n\030ValueRuleDeviceConditi" +
      "on\022`\n\014device_types\030\001 \003(\0162J.google.ads.go" +
      "ogleads.v8.enums.ValueRuleDeviceTypeEnum" +
      ".ValueRuleDeviceType\032\234\001\n\032ValueRuleAudien" +
      "ceCondition\022:\n\nuser_lists\030\001 \003(\tB&\372A#\n!go" +
      "ogleads.googleapis.com/UserList\022B\n\016user_" +
      "interests\030\002 \003(\tB*\372A\'\n%googleads.googleap" +
      "is.com/UserInterest:z\352Aw\n,googleads.goog" +
      "leapis.com/ConversionValueRule\022Gcustomer" +
      "s/{customer_id}/conversionValueRules/{co" +
      "nversion_value_rule_id}B\205\002\n%com.google.a" +
      "ds.googleads.v8.resourcesB\030ConversionVal" +
      "ueRuleProtoP\001ZJgoogle.golang.org/genprot" +
      "o/googleapis/ads/googleads/v8/resources;" +
      "resources\242\002\003GAA\252\002!Google.Ads.GoogleAds.V" +
      "8.Resources\312\002!Google\\Ads\\GoogleAds\\V8\\Re" +
      "sources\352\002%Google::Ads::GoogleAds::V8::Re" +
      "sourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v8.enums.ConversionValueRuleStatusProto.getDescriptor(),
          com.google.ads.googleads.v8.enums.ValueRuleDeviceTypeProto.getDescriptor(),
          com.google.ads.googleads.v8.enums.ValueRuleGeoLocationMatchTypeProto.getDescriptor(),
          com.google.ads.googleads.v8.enums.ValueRuleOperationProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v8_resources_ConversionValueRule_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v8_resources_ConversionValueRule_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v8_resources_ConversionValueRule_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Action", "GeoLocationCondition", "DeviceCondition", "AudienceCondition", "OwnerCustomer", "Status", });
    internal_static_google_ads_googleads_v8_resources_ConversionValueRule_ValueRuleAction_descriptor =
      internal_static_google_ads_googleads_v8_resources_ConversionValueRule_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v8_resources_ConversionValueRule_ValueRuleAction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v8_resources_ConversionValueRule_ValueRuleAction_descriptor,
        new java.lang.String[] { "Operation", "Value", });
    internal_static_google_ads_googleads_v8_resources_ConversionValueRule_ValueRuleGeoLocationCondition_descriptor =
      internal_static_google_ads_googleads_v8_resources_ConversionValueRule_descriptor.getNestedTypes().get(1);
    internal_static_google_ads_googleads_v8_resources_ConversionValueRule_ValueRuleGeoLocationCondition_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v8_resources_ConversionValueRule_ValueRuleGeoLocationCondition_descriptor,
        new java.lang.String[] { "ExcludedGeoTargetConstants", "ExcludedGeoMatchType", "GeoTargetConstants", "GeoMatchType", });
    internal_static_google_ads_googleads_v8_resources_ConversionValueRule_ValueRuleDeviceCondition_descriptor =
      internal_static_google_ads_googleads_v8_resources_ConversionValueRule_descriptor.getNestedTypes().get(2);
    internal_static_google_ads_googleads_v8_resources_ConversionValueRule_ValueRuleDeviceCondition_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v8_resources_ConversionValueRule_ValueRuleDeviceCondition_descriptor,
        new java.lang.String[] { "DeviceTypes", });
    internal_static_google_ads_googleads_v8_resources_ConversionValueRule_ValueRuleAudienceCondition_descriptor =
      internal_static_google_ads_googleads_v8_resources_ConversionValueRule_descriptor.getNestedTypes().get(3);
    internal_static_google_ads_googleads_v8_resources_ConversionValueRule_ValueRuleAudienceCondition_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v8_resources_ConversionValueRule_ValueRuleAudienceCondition_descriptor,
        new java.lang.String[] { "UserLists", "UserInterests", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v8.enums.ConversionValueRuleStatusProto.getDescriptor();
    com.google.ads.googleads.v8.enums.ValueRuleDeviceTypeProto.getDescriptor();
    com.google.ads.googleads.v8.enums.ValueRuleGeoLocationMatchTypeProto.getDescriptor();
    com.google.ads.googleads.v8.enums.ValueRuleOperationProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}