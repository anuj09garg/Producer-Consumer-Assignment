package model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ad_detail")
public class AdDetail {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    long id;

    @Column(name = "ad_id")
    long adId;

    @Column(name = "ad_title")
    String adTitle;
}
