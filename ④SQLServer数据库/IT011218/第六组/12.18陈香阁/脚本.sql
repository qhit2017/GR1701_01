USE [db_chenxiangge]
GO
/****** Object:  Table [dbo].[tb_student1]    Script Date: 12/19/2017 20:58:26 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[tb_student1](
	[Sno] [char](11) NOT NULL,
	[Sname] [char](20) NULL,
	[Ssex] [char](2) NULL,
	[Sage] [smallint] NULL,
	[Sdept] [char](20) NULL,
PRIMARY KEY CLUSTERED 
(
	[Sno] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[tb_SC1]    Script Date: 12/19/2017 20:58:26 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[tb_SC1](
	[Sno] [char](11) NOT NULL,
	[Cno] [char](4) NULL,
	[Grade] [smallint] NULL,
PRIMARY KEY CLUSTERED 
(
	[Sno] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[tb_guyuan]    Script Date: 12/19/2017 20:58:26 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tb_guyuan](
	[id] [tinyint] NOT NULL,
	[name] [nvarchar](10) NULL,
	[age] [tinyint] NULL,
	[dateline] [datetime] NULL,
	[salary] [decimal](6, 4) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tb_course1]    Script Date: 12/19/2017 20:58:26 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[tb_course1](
	[Cno] [char](4) NOT NULL,
	[cName] [char](20) NULL,
	[cpno] [char](4) NULL,
	[ccredit] [smallint] NULL,
PRIMARY KEY CLUSTERED 
(
	[Cno] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Default [DF__tb_student__Ssex__20C1E124]    Script Date: 12/19/2017 20:58:26 ******/
ALTER TABLE [dbo].[tb_student1] ADD  DEFAULT ('男') FOR [Ssex]
GO
/****** Object:  Check [CK__tb_student__Ssex__1FCDBCEB]    Script Date: 12/19/2017 20:58:26 ******/
ALTER TABLE [dbo].[tb_student1]  WITH CHECK ADD CHECK  (([Ssex]='男' OR [Ssex]='女'))
GO
