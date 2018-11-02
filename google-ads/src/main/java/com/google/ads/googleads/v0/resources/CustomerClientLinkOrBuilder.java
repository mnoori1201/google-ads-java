// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/resources/customer_client_link.proto

package com.google.ads.googleads.v0.resources;

public interface CustomerClientLinkOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v0.resources.CustomerClientLink)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the resource.
   * CustomerClientLink resource names have the form:
   * `customers/{customer_id}/customerClientLinks/{client_customer_id}_{manager_link_id}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Name of the resource.
   * CustomerClientLink resource names have the form:
   * `customers/{customer_id}/customerClientLinks/{client_customer_id}_{manager_link_id}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * The client customer linked to this customer. Read only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue client_customer = 3;</code>
   */
  boolean hasClientCustomer();
  /**
   * <pre>
   * The client customer linked to this customer. Read only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue client_customer = 3;</code>
   */
  com.google.protobuf.StringValue getClientCustomer();
  /**
   * <pre>
   * The client customer linked to this customer. Read only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue client_customer = 3;</code>
   */
  com.google.protobuf.StringValueOrBuilder getClientCustomerOrBuilder();

  /**
   * <pre>
   * This is uniquely identifies a customer client link. Read only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value manager_link_id = 4;</code>
   */
  boolean hasManagerLinkId();
  /**
   * <pre>
   * This is uniquely identifies a customer client link. Read only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value manager_link_id = 4;</code>
   */
  com.google.protobuf.Int64Value getManagerLinkId();
  /**
   * <pre>
   * This is uniquely identifies a customer client link. Read only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value manager_link_id = 4;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getManagerLinkIdOrBuilder();

  /**
   * <pre>
   * This is the status of the link between client and manager.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.enums.ManagerLinkStatusEnum.ManagerLinkStatus status = 5;</code>
   */
  int getStatusValue();
  /**
   * <pre>
   * This is the status of the link between client and manager.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.enums.ManagerLinkStatusEnum.ManagerLinkStatus status = 5;</code>
   */
  com.google.ads.googleads.v0.enums.ManagerLinkStatusEnum.ManagerLinkStatus getStatus();

  /**
   * <pre>
   * The visibility of the link. Users can choose whether or not to see hidden
   * links in the AdWords UI.
   * Default value is false
   * </pre>
   *
   * <code>.google.protobuf.BoolValue hidden = 6;</code>
   */
  boolean hasHidden();
  /**
   * <pre>
   * The visibility of the link. Users can choose whether or not to see hidden
   * links in the AdWords UI.
   * Default value is false
   * </pre>
   *
   * <code>.google.protobuf.BoolValue hidden = 6;</code>
   */
  com.google.protobuf.BoolValue getHidden();
  /**
   * <pre>
   * The visibility of the link. Users can choose whether or not to see hidden
   * links in the AdWords UI.
   * Default value is false
   * </pre>
   *
   * <code>.google.protobuf.BoolValue hidden = 6;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getHiddenOrBuilder();
}
