/*
 * Copyright 2023 Datastrato.
 * This software is licensed under the Apache License version 2.
 */
package com.datastrato.gravitino;

import java.util.Map;

/**
 * The interface of a metalake. The metalake is the top level entity in the gravitino system,
 * containing a set of catalogs.
 */
public interface Metalake extends Auditable {

  /** The name of the metalake. */
  String name();

  /** The comment of the metalake. */
  String comment();

  /** The properties of the metalake. */
  Map<String, String> properties();
}