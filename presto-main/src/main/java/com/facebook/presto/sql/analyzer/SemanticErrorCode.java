/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.facebook.presto.sql.analyzer;

public enum SemanticErrorCode
{
    MUST_BE_AGGREGATE_OR_GROUP_BY,
    NESTED_AGGREGATION,
    NESTED_WINDOW,
    MUST_BE_WINDOW_FUNCTION,

    MISSING_TABLE,
    MISMATCHED_COLUMN_ALIASES,
    NOT_SUPPORTED,

    INVALID_SCHEMA_NAME,

    TABLE_ALREADY_EXISTS,
    INVALID_MATERIALIZED_VIEW_REFRESH_INTERVAL,

    DUPLICATE_RELATION,

    TYPE_MISMATCH,
    AMBIGUOUS_ATTRIBUTE,
    MISSING_ATTRIBUTE,
    INVALID_ORDINAL,

    ORDER_BY_MUST_BE_IN_SELECT,

    CANNOT_HAVE_AGGREGATIONS_OR_WINDOWS,

    WILDCARD_WITHOUT_FROM,

    MISMATCHED_SET_COLUMN_TYPES,

    MULTIPLE_FIELDS_FROM_SCALAR_SUBQUERY,

    NON_NUMERIC_SAMPLE_PERCENTAGE,

    SAMPLE_PERCENTAGE_OUT_OF_RANGE
}
