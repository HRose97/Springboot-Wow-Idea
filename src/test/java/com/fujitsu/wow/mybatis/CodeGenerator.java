//package com.fujitsu.wow.mybatis;
//
//
//import com.baomidou.mybatisplus.annotation.DbType;
//import com.baomidou.mybatisplus.generator.AutoGenerator;
//import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
//import com.baomidou.mybatisplus.generator.config.GlobalConfig;
//import com.baomidou.mybatisplus.generator.config.PackageConfig;
//import com.baomidou.mybatisplus.generator.config.StrategyConfig;
//import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
//
//
///**
// * <p>
// * 代码生成器,使用方法,直接运行；根据控制台提示输入模块名(demo),然后输入表名即可
// * </p>
// */
//public class CodeGenerator {
//
//
//	/**
//     * 运行main方法生成文件
//     **/
//    public static void main(String[] args) {
//        // 生成器
//        AutoGenerator mpg = new AutoGenerator();
//        // 包配置
//        PackageConfig pc = new PackageConfig();
//        pc.setParent("com.fujitsu.wow");                // 父包名
//        pc.setController("controller");     // Controller包名
//        pc.setService("service");           // Service包名
//        pc.setServiceImpl("service.impl");  // Service Impl包名
//        pc.setMapper("com/fujitsu/wow/mapper");             // Mapper包名
//        pc.setEntity("pojo");             // Entity包名
//        pc.setXml("com/fujitsu/wow/mapper");                        // Mapper XML包名
//        mpg.setPackageInfo(pc);
//
//        // 全局配置
//        GlobalConfig gc = new GlobalConfig();
//        gc.setSwagger2(true);         // 开启swagger2模式
//        gc.setOutputDir("D:\\wow\\eclipse-code\\Springboot-Wow\\src\\main\\java");  // 生成文件存放的位置
//        gc.setFileOverride(true);     // 是否覆盖已有文件
//        gc.setActiveRecord(false);    // 开启ActiveRecord模式,默认false
//        gc.setEnableCache(false);     // 是否在xml中添加二级缓存配置,默认false
//        gc.setBaseResultMap(true);    // 开启BaseResultMap(通用查询映射结果)
//        gc.setBaseColumnList(true);   // 开启baseColumnList(通用查询结果列)
//        gc.setAuthor("FXS)Hzh");          // 开发人员
//        // 自定义文件命名，注意 %s 会自动填充表实体属性(各层文件名称方式，例如：%sAction生成UserAction, %s为占位符)
//        gc.setControllerName("%sController");
//        gc.setServiceName("%sService");
//        gc.setServiceImplName("%sServiceImpl");
//        gc.setMapperName("%sMapper");
//        gc.setXmlName("%sMapper");
//        mpg.setGlobalConfig(gc);
//
//        // 数据源配置
//        DataSourceConfig dsc = new DataSourceConfig();
////        dsc.setDbType(DbType.SQLITE);  // mysql生成用DbType.MYSQL
////        dsc.setDriverName("org.sqlite.JDBC");
////        dsc.setUsername("as");
////        dsc.setPassword("Admin01");
////        dsc.setUrl("jdbc:sqlite:D:/project/defect_detect/panel_defect/x64/Release/SqlData/SqlData.db");
//
//        dsc.setDbType(DbType.SQL_SERVER); // sqlserver生成
//        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
//        dsc.setUsername("root");
//        dsc.setPassword("5q6W7e8R");
//        dsc.setUrl("jdbc:mysql://192.168.195.131:3306/hzh_tsfse?useOldAliasMetadataBehavior=true&useSSL=false&serverTimezone=GMT");
//        mpg.setDataSource(dsc);
//
//        // 策略配置
//        StrategyConfig strategy = new StrategyConfig();
//        strategy.setTablePrefix(""); // 去掉表名前缀
//        strategy.setNaming(NamingStrategy.underline_to_camel); // 表名生成策略(underline_to_camel：下划线转驼峰命名)
//        strategy.setInclude("hzh_order"); // 表名
//        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
//        strategy.setSuperControllerClass("com.abc.xxx.controller.BaseController");
//        strategy.setSuperEntityClass("com.abc.xxx.entity.BaseEntity");
//        strategy.setEntityLombokModel(true);    // 实体类是否为lombok模型(默认false)
//        strategy.setRestControllerStyle(true);  // 生成 <code>@RestController</code> 控制器
////        strategy.setSuperControllerClass(null); // 自定义继承的Controller类全称，带包名
//        strategy.setSuperMapperClass("com.baomidou.mybatisplus.core.mapper.BaseMapper"); // 自定义继承的Mapper类全称，带包名
//        mpg.setStrategy(strategy);
//        // 执行生成
//        mpg.execute();
//    }
//
//}
//
