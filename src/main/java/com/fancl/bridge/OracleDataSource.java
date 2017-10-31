package com.fancl.bridge;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 作者 fanchengliang
 * 日期 2017/10/30
 * 项目 design-pattern
 */
public class OracleDataSource implements IDbDataSource {
    @Override
    public List<Map<String, Object>> loadData() {
        return new ArrayList<Map<String, Object>>();
    }

    @Override
    public String toString() {
        return "Oracle";
    }
}
