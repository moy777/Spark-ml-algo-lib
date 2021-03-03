// scalastyle:off header.matches
/*
* Copyright (C) 2021. Huawei Technologies Co., Ltd.
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
* */
/*
 * This file to You under the Apache License, Version 2.0;
 * you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *    http://www.apache.org/licenses/LICENSE-2.0
 */

package org.apache.spark.mllib.fpm

import org.apache.spark.internal.Logging
import org.apache.spark.mllib.fpm.LocalPrefixSpan.ReversedPrefix

object LocalPrefixSpanUtils extends Logging {

  def getLocalPrefixStat(
      newPrefix: ReversedPrefix,
      count: Long,
      maxPatternLength: Int,
      target: Long): (Long, Boolean) = {
    if (maxPatternLength == newPrefix.length) {
      (count, false)
    } else {
      (count, true)
    }
  }

}
