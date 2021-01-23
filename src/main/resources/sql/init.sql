--
-- Table structure for table `tasks`
--

CREATE TABLE `tasks`
(
    `id`       INT(11)      NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `author`   VARCHAR(50)  NOT NULL,
    `title`    VARCHAR(50)  NOT NULL,
    `task`     VARCHAR(150) NOT NULL,
    `solution` tinyint(1)   NOT NULL
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  COLLATE = utf8_unicode_ci;

--
-- Dumping data for table `product`
--
