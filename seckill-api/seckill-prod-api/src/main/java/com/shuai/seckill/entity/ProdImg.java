package com.shuai.seckill.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author yongshuai
 */
@Data
@Accessors(chain = true)
@Table(name = "tb_prod_img")
public class ProdImg implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer prodId;

    private Short prodImgOrder;

    private String prodImgSource;

}
