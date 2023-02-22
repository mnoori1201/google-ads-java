// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/services/conversion_upload_service.proto

package com.google.ads.googleads.v13.services;

public final class ConversionUploadServiceProto {
  private ConversionUploadServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_UploadClickConversionsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_UploadClickConversionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_UploadClickConversionsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_UploadClickConversionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_UploadCallConversionsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_UploadCallConversionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_UploadCallConversionsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_UploadCallConversionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_ClickConversion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_ClickConversion_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_CallConversion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_CallConversion_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_ExternalAttributionData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_ExternalAttributionData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_ClickConversionResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_ClickConversionResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_CallConversionResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_CallConversionResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_CustomVariable_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_CustomVariable_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_CartData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_CartData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_CartData_Item_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_CartData_Item_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nAgoogle/ads/googleads/v13/services/conv" +
      "ersion_upload_service.proto\022!google.ads." +
      "googleads.v13.services\0327google/ads/googl" +
      "eads/v13/common/offline_user_data.proto\032" +
      "@google/ads/googleads/v13/enums/conversi" +
      "on_environment_enum.proto\032\034google/api/an" +
      "notations.proto\032\027google/api/client.proto" +
      "\032\037google/api/field_behavior.proto\032\031googl" +
      "e/api/resource.proto\032\027google/rpc/status." +
      "proto\"\323\001\n\035UploadClickConversionsRequest\022" +
      "\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022L\n\013conversions" +
      "\030\002 \003(\01322.google.ads.googleads.v13.servic" +
      "es.ClickConversionB\003\340A\002\022\034\n\017partial_failu" +
      "re\030\003 \001(\010B\003\340A\002\022\025\n\rvalidate_only\030\004 \001(\010\022\025\n\r" +
      "debug_enabled\030\005 \001(\010\"\236\001\n\036UploadClickConve" +
      "rsionsResponse\0221\n\025partial_failure_error\030" +
      "\001 \001(\0132\022.google.rpc.Status\022I\n\007results\030\002 \003" +
      "(\01328.google.ads.googleads.v13.services.C" +
      "lickConversionResult\"\272\001\n\034UploadCallConve" +
      "rsionsRequest\022\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022" +
      "K\n\013conversions\030\002 \003(\01321.google.ads.google" +
      "ads.v13.services.CallConversionB\003\340A\002\022\034\n\017" +
      "partial_failure\030\003 \001(\010B\003\340A\002\022\025\n\rvalidate_o" +
      "nly\030\004 \001(\010\"\234\001\n\035UploadCallConversionsRespo" +
      "nse\0221\n\025partial_failure_error\030\001 \001(\0132\022.goo" +
      "gle.rpc.Status\022H\n\007results\030\002 \003(\01327.google" +
      ".ads.googleads.v13.services.CallConversi" +
      "onResult\"\357\005\n\017ClickConversion\022\022\n\005gclid\030\t " +
      "\001(\tH\000\210\001\001\022\016\n\006gbraid\030\022 \001(\t\022\016\n\006wbraid\030\023 \001(\t" +
      "\022\036\n\021conversion_action\030\n \001(\tH\001\210\001\001\022!\n\024conv" +
      "ersion_date_time\030\013 \001(\tH\002\210\001\001\022\035\n\020conversio" +
      "n_value\030\014 \001(\001H\003\210\001\001\022\032\n\rcurrency_code\030\r \001(" +
      "\tH\004\210\001\001\022\025\n\010order_id\030\016 \001(\tH\005\210\001\001\022]\n\031externa" +
      "l_attribution_data\030\007 \001(\0132:.google.ads.go" +
      "ogleads.v13.services.ExternalAttribution" +
      "Data\022K\n\020custom_variables\030\017 \003(\01321.google." +
      "ads.googleads.v13.services.CustomVariabl" +
      "e\022>\n\tcart_data\030\020 \001(\0132+.google.ads.google" +
      "ads.v13.services.CartData\022I\n\020user_identi" +
      "fiers\030\021 \003(\0132/.google.ads.googleads.v13.c" +
      "ommon.UserIdentifier\022o\n\026conversion_envir" +
      "onment\030\024 \001(\0162O.google.ads.googleads.v13." +
      "enums.ConversionEnvironmentEnum.Conversi" +
      "onEnvironmentB\010\n\006_gclidB\024\n\022_conversion_a" +
      "ctionB\027\n\025_conversion_date_timeB\023\n\021_conve" +
      "rsion_valueB\020\n\016_currency_codeB\013\n\t_order_" +
      "id\"\223\003\n\016CallConversion\022\026\n\tcaller_id\030\007 \001(\t" +
      "H\000\210\001\001\022!\n\024call_start_date_time\030\010 \001(\tH\001\210\001\001" +
      "\022\036\n\021conversion_action\030\t \001(\tH\002\210\001\001\022!\n\024conv" +
      "ersion_date_time\030\n \001(\tH\003\210\001\001\022\035\n\020conversio" +
      "n_value\030\013 \001(\001H\004\210\001\001\022\032\n\rcurrency_code\030\014 \001(" +
      "\tH\005\210\001\001\022K\n\020custom_variables\030\r \003(\01321.googl" +
      "e.ads.googleads.v13.services.CustomVaria" +
      "bleB\014\n\n_caller_idB\027\n\025_call_start_date_ti" +
      "meB\024\n\022_conversion_actionB\027\n\025_conversion_" +
      "date_timeB\023\n\021_conversion_valueB\020\n\016_curre" +
      "ncy_code\"\253\001\n\027ExternalAttributionData\022(\n\033" +
      "external_attribution_credit\030\003 \001(\001H\000\210\001\001\022\'" +
      "\n\032external_attribution_model\030\004 \001(\tH\001\210\001\001B" +
      "\036\n\034_external_attribution_creditB\035\n\033_exte" +
      "rnal_attribution_model\"\222\002\n\025ClickConversi" +
      "onResult\022\022\n\005gclid\030\004 \001(\tH\000\210\001\001\022\016\n\006gbraid\030\010" +
      " \001(\t\022\016\n\006wbraid\030\t \001(\t\022\036\n\021conversion_actio" +
      "n\030\005 \001(\tH\001\210\001\001\022!\n\024conversion_date_time\030\006 \001" +
      "(\tH\002\210\001\001\022I\n\020user_identifiers\030\007 \003(\0132/.goog" +
      "le.ads.googleads.v13.common.UserIdentifi" +
      "erB\010\n\006_gclidB\024\n\022_conversion_actionB\027\n\025_c" +
      "onversion_date_time\"\352\001\n\024CallConversionRe" +
      "sult\022\026\n\tcaller_id\030\005 \001(\tH\000\210\001\001\022!\n\024call_sta" +
      "rt_date_time\030\006 \001(\tH\001\210\001\001\022\036\n\021conversion_ac" +
      "tion\030\007 \001(\tH\002\210\001\001\022!\n\024conversion_date_time\030" +
      "\010 \001(\tH\003\210\001\001B\014\n\n_caller_idB\027\n\025_call_start_" +
      "date_timeB\024\n\022_conversion_actionB\027\n\025_conv" +
      "ersion_date_time\"{\n\016CustomVariable\022Z\n\032co" +
      "nversion_custom_variable\030\001 \001(\tB6\372A3\n1goo" +
      "gleads.googleapis.com/ConversionCustomVa" +
      "riable\022\r\n\005value\030\002 \001(\t\"\371\001\n\010CartData\022\023\n\013me" +
      "rchant_id\030\006 \001(\003\022\031\n\021feed_country_code\030\002 \001" +
      "(\t\022\032\n\022feed_language_code\030\003 \001(\t\022\036\n\026local_" +
      "transaction_cost\030\004 \001(\001\022?\n\005items\030\005 \003(\01320." +
      "google.ads.googleads.v13.services.CartDa" +
      "ta.Item\032@\n\004Item\022\022\n\nproduct_id\030\001 \001(\t\022\020\n\010q" +
      "uantity\030\002 \001(\005\022\022\n\nunit_price\030\003 \001(\0012\364\004\n\027Co" +
      "nversionUploadService\022\211\002\n\026UploadClickCon" +
      "versions\022@.google.ads.googleads.v13.serv" +
      "ices.UploadClickConversionsRequest\032A.goo" +
      "gle.ads.googleads.v13.services.UploadCli" +
      "ckConversionsResponse\"j\202\323\344\223\002:\"5/v13/cust" +
      "omers/{customer_id=*}:uploadClickConvers" +
      "ions:\001*\332A\'customer_id,conversions,partia" +
      "l_failure\022\205\002\n\025UploadCallConversions\022?.go" +
      "ogle.ads.googleads.v13.services.UploadCa" +
      "llConversionsRequest\032@.google.ads.google" +
      "ads.v13.services.UploadCallConversionsRe" +
      "sponse\"i\202\323\344\223\0029\"4/v13/customers/{customer" +
      "_id=*}:uploadCallConversions:\001*\332A\'custom" +
      "er_id,conversions,partial_failure\032E\312A\030go" +
      "ogleads.googleapis.com\322A\'https://www.goo" +
      "gleapis.com/auth/adwordsB\210\002\n%com.google." +
      "ads.googleads.v13.servicesB\034ConversionUp" +
      "loadServiceProtoP\001ZIgoogle.golang.org/ge" +
      "nproto/googleapis/ads/googleads/v13/serv" +
      "ices;services\242\002\003GAA\252\002!Google.Ads.GoogleA" +
      "ds.V13.Services\312\002!Google\\Ads\\GoogleAds\\V" +
      "13\\Services\352\002%Google::Ads::GoogleAds::V1" +
      "3::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v13.common.OfflineUserDataProto.getDescriptor(),
          com.google.ads.googleads.v13.enums.ConversionEnvironmentEnumProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v13_services_UploadClickConversionsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v13_services_UploadClickConversionsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_UploadClickConversionsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Conversions", "PartialFailure", "ValidateOnly", "DebugEnabled", });
    internal_static_google_ads_googleads_v13_services_UploadClickConversionsResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v13_services_UploadClickConversionsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_UploadClickConversionsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v13_services_UploadCallConversionsRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v13_services_UploadCallConversionsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_UploadCallConversionsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Conversions", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v13_services_UploadCallConversionsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v13_services_UploadCallConversionsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_UploadCallConversionsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v13_services_ClickConversion_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v13_services_ClickConversion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_ClickConversion_descriptor,
        new java.lang.String[] { "Gclid", "Gbraid", "Wbraid", "ConversionAction", "ConversionDateTime", "ConversionValue", "CurrencyCode", "OrderId", "ExternalAttributionData", "CustomVariables", "CartData", "UserIdentifiers", "ConversionEnvironment", "Gclid", "ConversionAction", "ConversionDateTime", "ConversionValue", "CurrencyCode", "OrderId", });
    internal_static_google_ads_googleads_v13_services_CallConversion_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v13_services_CallConversion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_CallConversion_descriptor,
        new java.lang.String[] { "CallerId", "CallStartDateTime", "ConversionAction", "ConversionDateTime", "ConversionValue", "CurrencyCode", "CustomVariables", "CallerId", "CallStartDateTime", "ConversionAction", "ConversionDateTime", "ConversionValue", "CurrencyCode", });
    internal_static_google_ads_googleads_v13_services_ExternalAttributionData_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_ads_googleads_v13_services_ExternalAttributionData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_ExternalAttributionData_descriptor,
        new java.lang.String[] { "ExternalAttributionCredit", "ExternalAttributionModel", "ExternalAttributionCredit", "ExternalAttributionModel", });
    internal_static_google_ads_googleads_v13_services_ClickConversionResult_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_ads_googleads_v13_services_ClickConversionResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_ClickConversionResult_descriptor,
        new java.lang.String[] { "Gclid", "Gbraid", "Wbraid", "ConversionAction", "ConversionDateTime", "UserIdentifiers", "Gclid", "ConversionAction", "ConversionDateTime", });
    internal_static_google_ads_googleads_v13_services_CallConversionResult_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_ads_googleads_v13_services_CallConversionResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_CallConversionResult_descriptor,
        new java.lang.String[] { "CallerId", "CallStartDateTime", "ConversionAction", "ConversionDateTime", "CallerId", "CallStartDateTime", "ConversionAction", "ConversionDateTime", });
    internal_static_google_ads_googleads_v13_services_CustomVariable_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_ads_googleads_v13_services_CustomVariable_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_CustomVariable_descriptor,
        new java.lang.String[] { "ConversionCustomVariable", "Value", });
    internal_static_google_ads_googleads_v13_services_CartData_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_ads_googleads_v13_services_CartData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_CartData_descriptor,
        new java.lang.String[] { "MerchantId", "FeedCountryCode", "FeedLanguageCode", "LocalTransactionCost", "Items", });
    internal_static_google_ads_googleads_v13_services_CartData_Item_descriptor =
      internal_static_google_ads_googleads_v13_services_CartData_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v13_services_CartData_Item_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_CartData_Item_descriptor,
        new java.lang.String[] { "ProductId", "Quantity", "UnitPrice", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v13.common.OfflineUserDataProto.getDescriptor();
    com.google.ads.googleads.v13.enums.ConversionEnvironmentEnumProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
