USE [db_employee]
GO
/****** Object:  Table [dbo].[tb_employee]    Script Date: 12/15/2017 17:35:18 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tb_employee](
	[id] [tinyint] NOT NULL,
	[name] [nvarchar](32) NOT NULL,
	[salary] [money] NULL,
	[department] [nvarchar](16) NULL,
	[entryTime] [date] NULL,
	[interpolate] [bit] NULL,
	[remark] [ntext] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Default [DF__tb_employ__salar__03317E3D]    Script Date: 12/15/2017 17:35:18 ******/
ALTER TABLE [dbo].[tb_employee] ADD  DEFAULT ((3200)) FOR [salary]
GO
