USE [db_employee]
GO
/****** Object:  Table [dbo].[tb_employee]    Script Date: 12/16/2017 14:20:01 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tb_employee](
	[id] [tinyint] NOT NULL,
	[name] [nvarchar](32) NOT NULL,
	[salary] [money] NULL,
	[dateline] [date] NULL,
	[recommend] [bit] NULL,
	[department] [nvarchar](16) NULL,
	[remark] [ntext] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Default [DF__tb_employ__salar__060DEAE8]    Script Date: 12/16/2017 14:20:01 ******/
ALTER TABLE [dbo].[tb_employee] ADD  DEFAULT ((3000)) FOR [salary]
GO
