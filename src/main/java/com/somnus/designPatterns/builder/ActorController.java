package com.somnus.designPatterns.builder;

/**
 * 
 *@Project:J2SE
 *@class:ActorController
 *@descript:
 *@date:2016年6月8日 下午4:26:10
 *@author San
 *@version:V1.0
 */
// 游戏角色创建控制器：指挥者
public class ActorController {
    // 逐步构建复杂产品对象
    public Actor construct(ActorBuilder ab) {
        ab.buildType();
        ab.buildSex();
        ab.buildFace();
        ab.buildCostume();
        ab.buildHairstyle();
        Actor actor = ab.createActor();
        return actor;
    }
}
