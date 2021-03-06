USE [db_employee]
GO
/****** Object:  Table [dbo].[tb_employee]    Script Date: 12/15/2017 17:38:03 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tb_employee](
	[id] [tinyint] NOT NULL,
	[name] [nvarchar](18) NOT NULL,
	[salary] [money] NULL,
	[dateline] [date] NULL,
	[recommend] [bit] NULL,
	[remark] [ntext] NULL,
	[age] [tinyint] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Default [DF__tb_employ__salar__014935CB]    Script Date: 12/15/2017 17:38:03 ******/
ALTER TABLE [dbo].[tb_employee] ADD  DEFAULT ((2000)) FOR [salary]
GO
