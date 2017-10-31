package com.fancl.bridge;

import java.util.List;
import java.util.Map;

/**
 * 作者 fanchengliang
 * 日期 2017/10/30
 * 项目 design-pattern
 *
 * 扩充接口
 */
public interface IDbDataSource {
    List<Map<String,Object>> loadData();
}
